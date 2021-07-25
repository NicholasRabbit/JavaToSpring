//JDBC���ݿ��������������װ����ϰ����

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JdbcUtilTest {

	public static void main(String[] args){
		
		Connection connect=null;
		PreparedStatement ps=null;

		try{
			//ͨ����ȡ��װ����������ȡ����
			connect=JdbcUtil.getConnection();   //JdbcUtil��װ��������getConnection()�������׳�SQLException
			
			//��ȡ�������ݿ����
			ps=connect.prepareStatement("insert into userlogin (name,password) values (?,?)");
			ps.setString(1,"Lily");
			ps.setString(2,"000");

			//ִ�в���
			ps.executeUpdate();
			
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			JdbcUtil.close(connect,ps,null);  //finally�йر���Դֱ�ӵ��÷�װ���еķ�����������,�쳣�ڷ�װ�����Ѳ�׽
		}
	}	
}