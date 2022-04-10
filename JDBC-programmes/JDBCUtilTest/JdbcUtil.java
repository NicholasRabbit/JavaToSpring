import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JdbcUtil {

	static{
		try{
			Class.forName("com.mysql.jdbc.Driver");
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}
		
	}

	public static Connection getConnection() throws SQLException {
		String url="jdbc:mysql://localhost:3306/mydatabase";
		String user="root";
		String password="nicholas1200";
		Connection connect=DriverManager.getConnection(url,user,password);
		return connect;
	}

	public static void close(Connection connect,Statement state,ResultSet rs){
		if(rs != null){
			try{
				rs.close();
			}catch(SQLException e){
				e.printStackTrace();
			}
		}

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