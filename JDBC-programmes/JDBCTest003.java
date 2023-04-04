/* ����ʹ�������ļ�����Դ����ResourceBundle,������Ʊ�дJDBC���뷶��
 * �����ļ�����·���²��ܱ�ResourceBundle�󶨣���WEB-INF�µİ󶨲��ˣ�WEB-INF�µ��б�ķ�ʽ�󶨡�
*/
import java.util.ResourceBundle;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCTest003 {

	public static void main(String[] args){
	
		//�Ȱ������ļ�
		ResourceBundle bundle=ResourceBundle.getBundle("com\\javase\\jdbc\\info");
		String database=bundle.getString("database");
		String url=bundle.getString("url");
		String user=bundle.getString("user");
		String password=bundle.getString("password");
		System.out.println(database+","+url+","+user+","+password);
		Connection connect=null;
		Statement state=null;
		
		try{
			//��һ����ע������
			Class c=Class.forName("com.mysql.jdbc.Driver");
			
			//�ڶ�������ȡ����
			connect=DriverManager.getConnection(url,user,password);

			//����������ȡ�������ݿ�Ķ�����
			state=connect.createStatement();

			//���Ĳ����������ݿ����
			state.executeUpdate("delete from t_class where name='Jerry'");  
		

		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
		   //���������ر���Դ,��С����
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