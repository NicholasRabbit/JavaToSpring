//验证一个类User的属性中必须有一个int age 范例

import java.lang.reflect.Field;

public class MustHaveAgeTest {

	public static void main(String[] args){
	
		Class userClass=null;
		try{
			userClass=Class.forName("User");
			
			boolean b=userClass.isAnnotationPresent(MustHaveAgeAnno.class);
			if(b){
				Field[] fields=userClass.getDeclaredFields();
				
				//赋予b2初始值，必须为false,这样第一个if语句通不过，第二个就可以通过，并报异常
				boolean b2=false;
				for(Field f : fields){
					String name=f.getName();
					String type=f.getType().getSimpleName();
					if("age".equals(name) & "int".equals(type)){
					    b2=true;
						break;
					}
					if(!b2){
					    MyException me=new MyException("必须有int类型age属性");
						throw me;
					}
				}
			}

		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}catch(MyException e){
			String simpleMessage=e.getMessage();
			System.out.println(simpleMessage);
		}
	}

}