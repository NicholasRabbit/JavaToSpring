/*JDBC��ʾ������Ʒ���������ʹ���ֶ��ύ
*/

import java.util.ResourceBundle;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class JDBCTest009 {

	public static void main(String[] args){
	
		int count=transactionMethod();
		System.out.println(count);
	}

	public static int transactionMethod(){
		
		int count=0;
		Connection connect=null;
		PreparedStatement ps=null;

		try{
		   //��һ����ע������
		   Class c=Class.forName("com.mysql.jdbc.Driver");

		   //�ڶ�������ȡ����
		   connect=DriverManager.getConnection("jdbc:mysql://localhost:3306/bank","root","nicholas1200");
           //�ر��Զ��ύ����Ϊ�ֶ��ύģʽ
		   connect.setAutoCommit(false);
		   
		   //����������ȡ�������ݿ������
		   ps=connect.prepareStatement("update account set balance=? where accountno=?");
		   ps.setDouble(1,10000);
		   ps.setInt(2,202101);
		   count+=ps.executeUpdate();

		   //String str=null;    //�˴�����ʱ��ָ���쳣����ϳ�������ִ��
		   //str.toString();

		   ps.setDouble(1,10000);   //��202102�˻��ڼ�10000Բ
		   ps.setInt(2,202102);
		   count+=ps.executeUpdate();

		   String ifSuccess=(count==2) ? "ת�˳ɹ�" : "ת��ʧ��";
		   System.out.println(ifSuccess);

		   connect.commit();   //���������˻��Ĳ���ִ������������ֶ��ύ
		   
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			if(ps != null){
				try{
					ps.close();
				}catch(SQLException e){
					e.printStackTrace();
				}
			}
			if(connect != null){
				try{
					connect.rollback();   //�ع�, �ŵ�finally�У���һ����ִ��
					connect.close();
				}catch(SQLException e){
					e.printStackTrace();
				}
			}
		}
		
		return count;

	}

}