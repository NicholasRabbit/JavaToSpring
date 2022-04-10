import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;

public class JDBCTest001 {

	public static void main(String[] args){
		
		Connection connect=null;
		Statement state=null;
		try{
		   //JDBC��̲���;
    	   //��һ����ע������������jvmҪ�����������ݿ�
		   Driver driver=new com.mysql.jdbc.Driver();  //�����Ƕ�̬��ǰ���Ǹ�Driver��java�еĽӿڣ�������mysql��ʵ����
		   DriverManager.registerDriver(driver);    //����DriverManager�еľ�̬��������driver����ע���ȥ			
		   
		   //�ڶ�������ȡ���ӣ���ͨ��url���û���������������,�����߶���String����,����ֵ��mysqlʵ�����Connection����
		   String url="jdbc:mysql://192.168.0.102:3306/mydatabase";
		   String user="root";
		   String password="nicholas1200";
		   connect=DriverManager.getConnection(url,user,password);  //�����ȡ����mysqlʵ�������
		   System.out.println("���ݿ����Ӷ���"+connect);  //��������ݿ����Ӷ���com.mysql.jdbc.JDBC4Connection@41cf53f9

		   //������������connect����ķ����������ݿ�,��ִ��sql���,
		   state=connect.createStatement();  //���stateָ���Ҳ��mysql��ʵ����StatementImpl
		   System.out.println(state);                  //�����com.mysql.jdbc.StatementImpl@5a10411 
           
		   /*���Ĳ���ִ��sql��䣬ָ��state�������execute(..)���������sql���
		             ����ֵָӰ�����ݿ��м�¼����
		   */      
		   int i=state.executeUpdate("insert into t_class (name,age) values ('Jerry',17) ");
		   System.out.println(i);
               //(1)java��дmysql��䲻�üӷֺš�����  (2)ע��sql������ַ����������ݻ��Ǽӵ�����:''
                                                                 
		   //���岽�������ѯ�����ֻ��Ե��Ĳ���ִ��select���ʱ�����

		}catch(SQLException e){
		   e.printStackTrace();
		}finally{
		   	
			/*���������رս��̣��ͷ���Դ
			  ע������:(1)��С�������ιر�   StatementС-->��Connecttion
					   (2)��ͬ��Դ�ֿ�try{},��Ϊ��try����У���һ�����쳣������������䲻ִ���ˣ�Ҳ���޷��ͷ���
			*/
			if(state !=null){
			   try{
			      state.close();
			   }catch(SQLException e){
				  e.printStackTrace();
			   }
			}
			if(connect!=null){
			   try{
			     connect.close();
			   }catch(SQLException e){
				  e.printStackTrace();
			   }
			}

		}
		
	}

}