//�ص����ݣ�ͨ����������޸�����ֵ������ȡ���Եİ취

package com.javase.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class FieldTest004{

	public static void main(String[] args){
	
		Class c=null;
		Object obj=null;
		try{
			c=Class.forName("com.javase.reflect.Student");
			obj=c.newInstance();        //ͨ������ʵ��������Ҫ�޸ĵľ���������������
			System.out.println(obj);
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}catch(InstantiationException | IllegalAccessException e){
			e.printStackTrace();
		}

		//ע�ⷴ������޸�����ֵ����ȡ����ֵ�ķ�ʽ��һ��new �ķ�ʽ��һ��
		try{
			Field f=c.getField("name");     //��ȡname�������Filed f
     		f.set(obj, "Tom");              //����Field����ķ���set(ʵ�����Ķ����޸�ֵ)
			String name=(String)f.get(obj); //����Field�����f.get(Object obj)����ȡֵ������ȡ����obj�������f��ֵ
			System.out.println(name);

			//�޸ķ�pbulic���ε����Եķ�ʽ�������������Ա�Ϊ���޸ĵģ�ʹ��Field  f.setAccessable(boolean b)����
			
			//Field f2=c.getField("age");          //ʹ��c.getField("age")��ȡ��public���ε�����age�ᱨ�쳣����ȡ������
			Field f2=c.getDeclaredField("age");    //��ʹ��getDeclaredField("age");
			f2.setAccessible(true);
			
			/*(1)ע�⣬����"25"ʵ��ʱ�Զ������Integer���ˣ���Ϊset(obj,obj)�β���Object����
			  (2)�����byte,short���͵�������int���ͷ�ΧС�Ļ������������򲻿��ԣ���Ϊint�����޷��Զ�ת��ΪС��Χ���͵ģ���Ȼ����Ҳ�޷��Զ������
			     ������д:byte b=25; f2.set(obj,b); ʵ��b=25ʱ����int���͵�25�Զ�ת��Ϊbyte���Ͳ���ֵ��b(��ϰ������������ת������)
              (3)��int��Χ��Ŀ��Զ����
			*/
			f2.set(obj,25);  
							 
			//(4)Field��������field����get(Object obj)�������÷�����ȡ����ֵ��obj��ʾʵ�����Ķ�������				
			boolean  b=(f2.get(obj)  instanceof Integer);  
			System.out.println(b);					//get(obj)�����ѻ�������int��������ֵת�������Ӧ�İ�װ��󣬷���һ��Object��������objʵ�ʶ�Ӧ����Integer
			Integer privateAge=(Integer)f2.get(obj);   
			System.out.println(privateAge);

		
			
		}catch(NoSuchFieldException e){
			e.printStackTrace();	
		}catch(IllegalArgumentException | IllegalAccessException e ){
			e.printStackTrace();
		}catch(SecurityException e){
			e.printStackTrace();
		}
	
	}

}