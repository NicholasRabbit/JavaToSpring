package com.javase.reflect;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
/*����һ�����еĵ�������������getDeclaredMethd(String name, Class<?>... parametherTypes)
  Class<?>... parametherTypes�ɱ䳤�Ȳ���������Ϊ��
  ����취���Եõ��ǹ���(protected,defalut,private)�ķ���
  
  ����һ��getDeclaredMethods(..)�Ǹ���Methods,���ص������飬ע������
*/

public class ReflectMethodTest001 {

	public static void main(String[] args){
	
		Class c=null;
		try{
			
			c=Class.forName("com.javase.reflect.User");
                                                                                   //�����õ��˿ɱ䳤�Ȳ���������Ϊ��
			/*�õ������ĵ�һ�ְ취������Class���� public Method getDeclaredMethd(String name, Class<?>... parametherTypes)
			  ����һ��doSome�ķ���Method����m1                                              Class�з���
			  ����Ϊ���裺
			*/
			//��ȡһ��Method����m1
			Method m1=c.getDeclaredMethod("doSome");
			System.out.println(m1.getName());
			
			//��ȡm1�������doSome()�����������η������ȡ����Field���η��İ취һ��
			int numModifier=m1.getModifiers();
			String modifiers=Modifier.toString(numModifier);
			System.out.println(numModifier+"����:"+modifiers);

			//��ȡ����ֵ���ͣ��õ�����Class�ࡣԴ�룺public Class<?> getReturnType(){},�з���
			Class returnTypeClass=m1.getReturnType();
			System.out.println(returnTypeClass);

			//��ȡ�����б�����ֵ��Class[]���飬Դ�룺public Class<?>[] getParameterTypes()
			//���û���βΣ��򷵻�ֵ��0
			Class[] paraArr=m1.getParameterTypes();
			System.out.println("�β��б����鳤�ȣ�"+paraArr.length);  //doSome()�β��б��ǿյģ��������0

			//��ȡUser�ǹ����ķ���privateMethod(int i)
			Method  privateMethod=c.getDeclaredMethod("privateMethod",int.class);





		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}catch(NoSuchMethodException | SecurityException e){
			e.printStackTrace();
		}
	}



}