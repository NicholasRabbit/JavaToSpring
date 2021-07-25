import java.lang.reflect.Modifier;

public class MySqlReflection {

	public static void main(String[] args){
	
		Class c=null;
		try{
			c=Class.forName("com.mysql.jdbc.Collation");
			int i=c.getModifiers();
			String  modifiers=Modifier.toString(i);
			System.out.println(modifiers);
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}
	
	}

}