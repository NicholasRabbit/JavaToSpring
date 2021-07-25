package com.javase.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

//Field��ͷ�����Ʒ���,ͨ������õ�һ���࣬ͨ����ķ������õ����Ե����η���Modifier�����������ͣ�Type��,��������
//ע���java.lang.reflect�����������ʹ��
//������ȡ��������Field
public class FieldTest001{

	public static void main(String[] args){
	 
		//Student stu=new Student();
		Class c=null;
		try{
			c=Class.forName("com.javase.reflect.Student");   //���ȷ���õ�һ��Student��c	
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}
		System.out.println(c);

		try{
		  
		   //��1�� ͨ����Class c.getField(Strig s)��ͨ�����ַ���һ������(field01����������η������ͣ���������)	                                     
		   Field  field01=c.getField("name");     
		   
		   //Field  field02=c.getField("age");     //�������ֻ�ܵõ�public���ε�����,Ĭ��(defalut),protected,private���εĶ�����   
		                                           //����getDeclaredField("age")���Ի�ȡ��public���ε�����
		   Field field02=c.getDeclaredField("age");   
		   
		   //��2����ȡ���η����õ�int 1,�ٵ���Modifier�ྲ̬�������� 1ת��Ϊ������public,���
		   //     getModifiers()�Ǹ�����˵�����η��Ƕ��ʱ��һ����ȡ������ MAX_VALUE�����η�public final static 
		   //  ��ȡname���η�
		   int  i01=field01.getModifiers();   
		   String   s01=Modifier.toString(i01);
		   System.out.println(i01+"==>"+s01);
		   
		   /*(3)ע��default���η�ʱʲôҲû�У����ǿո񣬾���ʲôҲû��
			 ����Student{double weight;} 
		   */
		   Field field03=c.getDeclaredField("weight");
		   int j=field03.getModifiers();
		   String modifiersDefault=Modifier.toString(j);
		   System.out.println("default is===>"+modifiersDefault+"<===");

		   //  ��ȡMAX_VALUE���η�
		   Field  field04=c.getField("MAX_VALUE");
		   int  i02=field04.getModifiers();    //����int�ǣ�
		   String  s02=Modifier.toString(i02);
		   System.out.println(i02+"==>"+s02);


		   //��4����ȡ�������ͣ�����ֵ��Class
		   Class c01=field01.getType();
		   System.out.println("ȫ��������������"+c01);   //���:java.lang.String ���ȫ��
		   String simpleName=c01.getSimpleName();
		   System.out.println("�����������"+simpleName);  //���:String ������
		}catch(NoSuchFieldException e){
		   e.printStackTrace();
		}catch(SecurityException e){
		   e.printStackTrace();
		}

		
		
	}

}