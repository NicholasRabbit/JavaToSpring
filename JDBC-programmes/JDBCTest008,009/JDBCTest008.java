/*JDBC��ʾ������Ʒ�����������ʾ��JDBC��sql������Զ��ύ�ģ�ʵ��Ӧ��ʱ��������ݶ�ʧ��009��ʾ�ֶ��ύ
  ע��setString(..),setDouble(..)���вη��������� PreparedStatement�����еģ�
  ��������Statement ps�������������еķ�����������ת��
*/

import java.util.ResourceBundle;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class JDBCTest008 {

	public static void main(String[] args){

		int count=transactionMethod();
		System.out.println(count);

	}

	public static int transactionMethod(){
		
		ResourceBundle bundle=ResourceBundle.getBundle("com/javase/jdbc/transactionFile"); //��porperties�����ļ���ע���ļ���Ҫ��properties��׺
		String driver=bundle.getString("driver");     //�������ļ���ȡ��������
		String url=bundle.getString("url");			  //��ȡurl
		String user=bundle.getString("user");         //��ȡ�û���
		String password=bundle.getString("password"); //��ȡ����
		
		Connection connect=null;
		PreparedStatement ps=null;
		
		int count=0;
		try{
			//��һ����ע������
			Class c=Class.forName(driver);

			//�ڶ�������ȡ���ݿ�����
			connect=DriverManager.getConnection(url,user,password);

			//����������ȡ�������ݿ���Ķ���
			ps=connect.prepareStatement("update account set balance=? where accountno=?");
			ps.setDouble(1,10000);   //��mysql���������int����10000�Զ�ת��Ϊdouble��10000.00
			ps.setInt(2,202101);     

			//���Ĳ���ִ�в���
			count+=ps.executeUpdate();

		    String str=null;   //����ģ������쳣�����������䲻��ִ��,�����sql����ȥ10000��û�мӵ�202102�˻���
			str.toString();
            
			//�������ݵ��˻�202102����һ��ִ�в���
			ps.setDouble(1,10000.00);
			ps.setInt(2,202102);
			
			count+=ps.executeUpdate();   //count�����ۼӣ����Ϊ2��˵�����˻�202101ת��202102�Ĳ����ɹ�������ʧ��
			
			String ifSuccess=(count==2) ? "ת�˳ɹ�" :"ת��ʧ��";
			System.out.println(ifSuccess);
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
					connect.close();
				}catch(SQLException e){
					e.printStackTrace();
				}
			}
		}
	
		return count;
	}


}