//通过反射得到一个注解，本例是得到Student类上的注解
//isAnnotationPresent(),getAnnotation()方法的使用
public class ReflectAnnotationTest001 {

	public static void main(String[] args){
	
	    Class c=null;
		try{
			//第一步：获取学生类
			c=Class.forName("Student");   //Student在类加载根目录下，就不用com.javase...这个类全名了
            
			//第二部：判断Student类上有没有MyAnno这个注解,
			//同时注意MyAnno这个注解的元注解是否是@RetentionPolicy.RUNTIME,这样才可以被反射机制读到
			boolean b=c.isAnnotationPresent(MyAnno.class);    
			System.out.println(b);
            
			//第三步：获取注解MyAnno，并调用它的属性，注意此处返回的值不能用Object来接收
			MyAnno ma=(MyAnno)c.getAnnotation(MyAnno.class);
			String name=ma.name();
			System.out.println(name);

			/*二三步可合并到if语句之中
			  if(c.isAnnotationPresent(MyAnno.class)){
				  MyAnno ma=(MyAnno)c.getAnnotation(MyAnno.class);
			      String name=ma.name();
			      System.out.println(name);
			  }
			*/

		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}
	}

}