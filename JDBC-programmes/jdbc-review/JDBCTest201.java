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
			//��һ������ȡ����������ȡmysqlд��jdbcʵ����
			Class c=Class.forName("com.mysql.jdbc.Driver");

			//�ڶ�������ȡ����
			String url="jdbc:mysql://localhost:3306/mydatabase";
			String user="root";
			String password="nicholas1200";
			connect=DriverManager.getConnection(url,user,password);

			//����������ȡ�������ݿ�Ķ���
			ps=connect.prepareStatement("insert into userlogin (name,password) values (?,?)");
			ps.setString(1,"hanks");
			ps.setString(2,"900");

			//���Ĳ���ִ�в���
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