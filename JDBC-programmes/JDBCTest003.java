/* 联合使用配置文件，资源绑定器ResourceBundle,反射机制编写JDBC代码范例
 * 配置文件在类路径下才能被ResourceBundle绑定，在WEB-INF下的绑定不了，WEB-INF下的有别的方式绑定。
*/
import java.util.ResourceBundle;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCTest003 {

	public static void main(String[] args){
	
		//先绑定配置文件
		ResourceBundle bundle=ResourceBundle.getBundle("com\\javase\\jdbc\\info");
		String database=bundle.getString("database");
		String url=bundle.getString("url");
		String user=bundle.getString("user");
		String password=bundle.getString("password");
		System.out.println(database+","+url+","+user+","+password);
		Connection connect=null;
		Statement state=null;
		
		try{
			//第一步，注册驱动
			Class c=Class.forName("com.mysql.jdbc.Driver");
			
			//第二步，获取链接
			connect=DriverManager.getConnection(url,user,password);

			//第三步，获取操作数据库的对象类
			state=connect.createStatement();

			//第四步，进行数据库操作
			state.executeUpdate("delete from t_class where name='Jerry'");  
		

		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
		   //第六步，关闭资源,从小到大
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