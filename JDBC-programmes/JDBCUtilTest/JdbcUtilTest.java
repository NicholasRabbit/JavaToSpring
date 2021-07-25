//JDBC数据库操作个人制作封装类练习范例

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JdbcUtilTest {

	public static void main(String[] args){
		
		Connection connect=null;
		PreparedStatement ps=null;

		try{
			//通过调取封装工具类来获取链接
			connect=JdbcUtil.getConnection();   //JdbcUtil封装工具类中getConnection()方法会抛出SQLException
			
			//获取操作数据库对象
			ps=connect.prepareStatement("insert into userlogin (name,password) values (?,?)");
			ps.setString(1,"Lily");
			ps.setString(2,"000");

			//执行操作
			ps.executeUpdate();
			
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			JdbcUtil.close(connect,ps,null);  //finally中关闭资源直接调用封装类中的方法，代码简洁,异常在封装类中已捕捉
		}
	}	
}