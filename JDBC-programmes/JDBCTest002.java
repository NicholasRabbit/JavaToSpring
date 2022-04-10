//�ڶ���ע�������ķ�����ʹ�÷�����ƣ����ַ�������
//ʹ�����ַ�ʽ��Ŀ��ʱΪ�˺������ļ�ʹ�á���JDBCTest003.java

import java.sql.*;

public class JDBCTest002 {

	public static void main(String[] args){
	
		Connection connect=null;
		Statement state=null;
		try{
			
			/*��һ����ע������,ͨ��������ƣ�����Class.forName(..)������ʹ��mysql��Driverʵ�����е�static��̬
		      �����ִ�У�������ע���������
		    */
			Class c=Class.forName("com.mysql.jdbc.Driver"); //����Ҳ���Բ����շ���ֵc
			
			
			//�ڶ��� ��ȡ����
			String url="jdbc:mysql://localhost:3306/grade";
			String user="root";
			String password="nicholas1200";
			connect=DriverManager.getConnection(url,user,password);
			System.out.println(connect);
			
			//����������ȡִ��SQL���Ķ���Statement
			state=connect.createStatement();

			//���Ĳ���ִ��SQL���
			state.executeUpdate("insert into t_class (num,name,age) values (6,'Jerry',43)");

            //���岽�������ѯ��������˲���ֻ��Ե��Ĳ�ʹ��select���ʱ�����
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
		//���������ر���Դ���ͷ��ڴ�,�����С����һ�ιرգ��ֿ�try,����д��һ��try����еĻ���
		//��һ����쳣�Ļ�����ߵ������޷�ִ�йر��ˡ���С˳��СStatement >> Connection��  
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