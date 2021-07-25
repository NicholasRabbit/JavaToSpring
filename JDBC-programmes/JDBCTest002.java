//第二种注册驱动的方法，使用反射机制，这种方法常用
//使用这种方式的目的时为了和配置文件使用。见JDBCTest003.java

import java.sql.*;

public class JDBCTest002 {

	public static void main(String[] args){
	
		Connection connect=null;
		Statement state=null;
		try{
			
			/*第一步，注册驱动,通过反射机制，调用Class.forName(..)方法，使得mysql的Driver实现类中的static静态
		      代码块执行，其内有注册驱动语句
		    */
			Class c=Class.forName("com.mysql.jdbc.Driver"); //这里也可以不接收返回值c
			
			
			//第二步 获取连接
			String url="jdbc:mysql://localhost:3306/grade";
			String user="root";
			String password="nicholas1200";
			connect=DriverManager.getConnection(url,user,password);
			System.out.println(connect);
			
			//第三步，获取执行SQL语句的对象Statement
			state=connect.createStatement();

			//第四步，执行SQL语句
			state.executeUpdate("insert into t_class (num,name,age) values (6,'Jerry',43)");

            //第五步，处理查询结果集，此步骤只针对第四步使用select语句时的情况
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
		//第六步，关闭资源，释放内存,把类从小到大一次关闭，分开try,否则写在一个try语句中的话，
		//有一句出异常的话，后边的语句就无法执行关闭了。大小顺序：小Statement >> Connection大  
		   if(state != null){
	           try{
				  state.close();
			   }catch(SQLException e){
			      e.printStackTrace();
			   }
		   }
		   if(connect != null){
	           try{
				  connect.close();
			   }catch(SQLException e){
			      e.printStackTrace();
			   }
		   }
		}
	}
	
}