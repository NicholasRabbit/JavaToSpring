//结合FieldTest001,002方法，使用反射机制反编译一个Student类,包括类名和全部属性，先不反编译方法

import java.lang.reflect.Modifier;
import java.lang.reflect.Field;

public class FieldTest003 {

	public static void main(String[] args){
	
		//用于拼接字符串
		StringBuffer  sbf=new StringBuffer();

		Class  c=null;
		try{
			
			//获取类那一行
			c=Class.forName("com.javase.reflect.Student");
			int i=c.getModifiers();
			String s=Modifier.toString(i);
			String name=c.getSimpleName();
			sbf.append(s+" "+"class"+" "+name+"{\n "+"\t");
			//System.out.println(sbf);

			//获取全部属性
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
