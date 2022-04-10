/*�ص㣬���÷�����Ƶ���һ����User�ķ���,���������User������ʵ����
  ע�⾲̬������ʵ������������ Method����ķ���public Object invoke(Object obj,Object... args)���ã�����obj��һ��User�����
  ֻ�������þ�̬����ʱobj=null,û��Ӱ�죬���ǿɱ����������obj��������޲���
  ��ΪObject... argsʱ�����������ͣ����Ի�����������int,byte�Ȼ��Զ�ת��Ϊ��Ӧ��װ��Integer,Byte
*/

package com.javase.reflect;

import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;

public class ReflectMethodTest003 {

	public static void main(String[] args){
		
		Class userClass=null;

		try{
		   //��ȡ��
		   userClass=Class.forName("com.javase.reflect.User");   //forName()�����з��ͻ���
		  
		   //ʵ�����࣬�õ�����
		   Object obj=userClass.newInstance();

		   //(1)�ȵ��þ�̬����doSome(),�޲η���
		   Method doSome=userClass.getDeclaredMethod("doSome");  
		   doSome.invoke(obj);   //invoke(Object obj,Object... args) obj����û�в����Ͳ�д

		   //(2)����ʵ������method01(String name, double weight);
		   Method method01=userClass.getDeclaredMethod("method01",String.class,double.class);  //ע��getDeclaredMethod( String name, Class<?>... parameterTypes)
		   method01.invoke(obj,"Tom",70.50);                          //�����ڲ���Ҫдȫ��д���β����ͣ�����ͬ�������޷��������أ�����ֻд������������
		   
		   //(3)�ǹ����ķ������Ի�ȡ�����ã�ע��invoke(Object obj,Object... args)����argsʱ������������
		   //���ԭ������byteҪת��Ϊ��װ��Byte����
		   Method protectedMethod=userClass.getDeclaredMethod("protectedMethod",byte.class);
		   Byte bb2=12;  //�Զ����
		   protectedMethod.invoke(obj,bb2);  

		}catch(ClassNotFoundException e){
		   e.printStackTrace();	
		}catch(InstantiationException | IllegalAccessException e){
		   e.printStackTrace();	
		}catch(NoSuchMethodException | SecurityException e){
		   e.printStackTrace();	
		}catch(IllegalArgumentException | InvocationTargetException e){
		   e.printStackTrace();	
		}
	}

}