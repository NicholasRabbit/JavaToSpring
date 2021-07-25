//������FieldTest001�����ϻ�ȡһ���������ȫ������Field���õ�һ����������Field[]

package com.javase.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class FieldTest002 {

	public static void main(String[] args){
		
		Class c=null;
		try{
		   c=Class.forName("com.javase.reflect.Student");  //forName(..)�����Ĳ�����String���͵ģ�ȫ������������
		   
		   //��ȡȫ�����Եķ�ʽ��getDeclaredFields()����һ���޲�������������һ��Field���飬����������ȫ������
		   Field[] fields=c.getDeclaredFields();  
		   for(Field f : fields){    //foreach���
		      
			  //��ȡ�������η�
			  String fieldName=f.getName();
			  String modifier=Modifier.toString(f.getModifiers());
			  
			  //��ȡ��������:int byte short�ȵ�
			  Class typeClass=f.getType();   //ȫ�ƣ����磬java.lang.String
			  String type=typeClass.getSimpleName();  //���  ���� String

			  System.out.println(modifier+" "+type+" "+f.getName());
		   }
		}catch(ClassNotFoundException e){
		   e.printStackTrace();
		}
	
	}
}

