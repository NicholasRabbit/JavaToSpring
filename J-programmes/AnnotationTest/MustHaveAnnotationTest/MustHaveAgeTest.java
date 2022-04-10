//��֤һ����User�������б�����һ��int age ����

import java.lang.reflect.Field;

public class MustHaveAgeTest {

	public static void main(String[] args){
	
		Class userClass=null;
		try{
			userClass=Class.forName("User");
			
			boolean b=userClass.isAnnotationPresent(MustHaveAgeAnno.class);
			if(b){
				Field[] fields=userClass.getDeclaredFields();
				
				//����b2��ʼֵ������Ϊfalse,������һ��if���ͨ�������ڶ����Ϳ���ͨ���������쳣
				boolean b2=false;
				for(Field f : fields){
					String name=f.getName();
					String type=f.getType().getSimpleName();
					if("age".equals(name) & "int".equals(type)){
					    b2=true;
						break;
					}
					if(!b2){
					    MyException me=new MyException("������int����age����");
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