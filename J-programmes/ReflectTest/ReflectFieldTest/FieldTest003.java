//���FieldTest001,002������ʹ�÷�����Ʒ�����һ��Student��,����������ȫ�����ԣ��Ȳ������뷽��

import java.lang.reflect.Modifier;
import java.lang.reflect.Field;

public class FieldTest003 {

	public static void main(String[] args){
	
		//����ƴ���ַ���
		StringBuffer  sbf=new StringBuffer();

		Class  c=null;
		try{
			
			//��ȡ����һ��
			c=Class.forName("com.javase.reflect.Student");
			int i=c.getModifiers();
			String s=Modifier.toString(i);
			String name=c.getSimpleName();
			sbf.append(s+" "+"class"+" "+name+"{\n "+"\t");
			//System.out.println(sbf);

			//��ȡȫ������
			Field[] fields=c.getDeclaredFields();
			for(int m=0; m<fields.length; m++){
			    int j=fields[m].getModifiers();
				String modifier=Modifier.toString(j);
				Class classType=fields[m].getType();
				String type=classType.getSimpleName();
				String fieldName=fields[m].getName();

				sbf.append(modifier+" "+type+" "+fieldName+";"+"\n"+"\t");

			}

			sbf.append("}");
			System.out.println(sbf);


		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}
	
	}

}
