import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCTest201 {

	public static void main(String[] args){
		
		Connection connect=null;
		PreparedStatement ps=null;
		ResultSet rs=null;

		try{
			//第一步，获取驱动，即获取mysql写的jdbc实现类
			Class c=Class.forName("com.mysql.jdbc.Driver");

			//第二步，获取链接
			String url="jdbc:mysql://localhost:3306/mydatabase";
			String user="root";
			String password="nicholas1200";
			connect=DriverManager.getConnection(url,user,password);

			//第三步，获取操作数据库的对象
			ps=connect.prepareStatement("insert into userlogin (name,password) values (?,?)");
			ps.setString(1,"hanks");
			ps.setString(2,"900");

			//第四步，执行操作
			ps.executeUpdate();
			
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			if(rs != null){
				try{
					rs.close();
				}catch(SQLException e){
					e.printStackTrace();
				}
			}
			if(ps != null){
				try{
					ps.close();
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