package com.springframe.aop;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component    //注解当前代理类，否则Spring不知道这是一个类，不会创建对象
@Aspect		  //表示这个类是一个切面，是个动态代理类
@Order(2)	  //定义切面类作用的优先级，选用自然数，值越低优先级越高，默认值为int最大值2^32，当一个目标类有多个切面类时使用，和MyLogAop02进行比较
public class MyLogAop {
	
	//@Before注解表示前置通知，即目标类指定方法执行前，执行该注解所在方法
	/*value的值可以用通配符代替      												
	第一个"*"替代饰符，表示任何修饰符都可以匹配
	第二个 "*"替代类名，表示这个aop报下任何类名都匹配，
	第三个"*"替代方法名，表示任何方法都匹配
	第四个".."是两点，表示任何形参都匹配
	*/                                                                 //注意，如果方法名写错的话，AOP就无法用，这个前置通知也不会被调用
	//@Before(value="execution(public int com.springframe.aop.Caculator.plus(int, int))")      //value后的值是切入点表达式，要写上被代理类的方法，即这个代理类（切面）从哪里切入进行代理执行目标类的相关功能
	@Before(value="execution(* com.springframe.aop.*.*(..))")
	public void beforeHandler(JoinPoint jpt) {   //注意这里的形参是JoinPoint，不是Joinpoint,第二个p是大写的
		System.out.println(jpt);                 //输出 :execution(int com.springframe.aop.CaculatorInterface.plus(int,int)),说明JointPoint就是切入点对象，其内封装了切入点相关信息
		
		//获取形参列表的参数，以Object[]数组形式返回
		Object[] objs=jpt.getArgs();  			 		     
		String argsName=Arrays.toString(objs);   
		//获取方法名,第一步首先获取签名对象Singature,第二步通过Singature获取方法名
		Signature  sig=jpt.getSignature();
		String  methodName=sig.getName();
		System.out.println("前置通知：  methodName==>"+methodName+", arguments==>"+argsName);
	}
	
	/*@After注解标注的方法表示后置通知，目标类方法执行后执行该注解所在方法
	(1)即使目标类方法里有异常抛出，@After所在方法还是会执行，其实相当于跟finally{}语句作用一样，如果AopTest001.java中divide()方法把除数设为0，抛异常by Zero，但还是会输出“后置通知”。
	(2)属性value赋值也可使用通配符，这里仅为个人熟悉，不写通配符
	*/																//注意，如果方法名写错的话，AOP就无法用，这个后置通知也不会被调用
	@After(value="execution(public int com.springframe.aop.Caculator.divide(int,int))")   //注意这个全限定名的切入点只针对Caculator.divide(..)方法有效，即后置通知只会加在这个方法之后，别的不起作用
	public void afterHandler() {        //
		System.out.println("后置通知");
	}
	
	/*@AfterReturning,注解的方法表示返回通知，
	 * (1)其中属性retValue="retValue"是接受目标类执行的方法的返回值，
	 * (2)注意属性值"retValue"要和形参列表里的Object retValue变量名一致，否者无法输出接收到的结果，该名称可自定义，但两者要保持一致
	 * */
	@AfterReturning(value="execution(* com.springframe.aop.*.*(..))" , returning="retValue")   //多个属性，不同属性之间要加逗号“，”
	public void afterReturning(JoinPoint jpt, Object retValue) {
		String methodName=jpt.getSignature().getName();    
		System.out.println("返回通知： methodName==>"+methodName+", retValue==>"+retValue);
	}
	
	/*@AfterThrowing,注解的方法表示接收目标类方法抛出的异常，把主测试方法中除数改为0可进行验证
	 * (1)其中形参列表第二项可指定接收抛出的异常，如不一致则不执行afterThrowing(..)方法，不发出异常通知,如果下面的ArithmeticException改为NullPointerException则接收不到异常信息
	 * (2)如果形参列表为空，无论目标类方法有任何异常都发出异常通知，即执行代理类afterThrowing(..)方法
	 * (3)注解属性throwing="except"的值“except”要和形参中异常变量名一致，否则无法接收到目标类的异常进行输出
	 * */
	@AfterThrowing(value="execution(* com.springframe.aop.*.*(..))", throwing="except")
	public void afterThrowing(JoinPoint jpt, ArithmeticException except) {    
		System.out.println("异常通知：");
		except.printStackTrace();
	}
	
	/*@Around,环绕通知注解，实际是前面所有通知的一个整合
	 * 
	 * */
	//@Around(value="* com.springframe.aop.*.*(..)")
	@Around(value="pointCut()")        //利用@Pointcut切入点标签赋值
	public Object aroundHandler(ProceedingJoinPoint pjp) {
		Object retValue=null;
		try {
			System.out.println("@Around: 前置通知");     
			retValue=pjp.proceed();      //这里接收目标类方法的返回值
			
			System.out.println("@Around: 返回通知");   //返回通知写在这里，下面返回值
			return retValue;  
		}catch(Throwable e) {   
			System.out.println("@Around: 异常通知"+e);  //这里的e接收目标类方法抛出的异常
			e.printStackTrace();
		}finally {
			System.out.println("@Around: 后置通知");     //后置通知要写到finally语句中，因为不管抛不抛异常后置通知都要执行
		}
		
		return -1;    //注意这里的-1自动打包了
	}
	
	/*@Pointcut注解，可统一规定切入点，别的注解只要调用它所在方法名，并赋值于value即可，见上文@Around
	 * */
	@Pointcut(value="execution(* com.springframe.aop.*.*(..))")
	public void pointCut() {
		
	}
	
	
	
	
}
