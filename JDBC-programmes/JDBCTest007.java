/*��ҪSQLע���������������û�Ҫ��������Ʒ�۸�ȣ��ڿ���̨����desc��asc��Щ������뱻����sql���ſ�
   ������ע�͵�Statement����ȷ��ʽ��ûע�͵�����֤PreparedStatement�಻������Ʒ����
*/

import java.sql.Connection;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.util.Scanner;

public class JDBCTest007{

	public static void main(String[] args){
		
		String custom=userInterface();

		boolean b=order(custom);
		
	}

	public static String userInterface(){
		Scanner s=new Scanner(System.in);
		System.out.print("�������������(asc������desc�ǽ���):");
		String custom=s.nextLine();
		return custom;
	}
	
	public static boolean order(String custom){
		
		
		Connection connect=null;
		//Statement state=null;
		PreparedStatement ps=null;
		ResultSet rs=null;

		boolean b=false;
		try{
			//��һ����ע������
			Class c=Class.forName("com.mysql.jdbc.Driver");
			
			//�ڶ�������ȡ���Ӷ���Connection
			String url="jdbc:mysql://localhost:3306/company";
			String user="root";
			String password="nicholas1200";
			connect =DriverManager.getConnection(url,user,password);
			
			//����������ȡ�������ݿ���Ķ���
			//state=connect.createStatement();
			String sql="select ename as employee,sal from emp order by sal ?";
			ps=connect.prepareStatement(sql);
			ps.setString(1,custom);

			//���Ĳ���ִ�в���
			//String sql="select ename as employee,sal from emp order by sal "+custom;   //ע��˫���������ӿո񣬷������һ����sal�ͺ�custom��ס����Ϊһ�����ˣ�����
			//rs=state.executeQuery(sql);
			rs=ps.executeQuery();

			//���岽�������ѯ�����
			while(rs.next()){
				b=true;
				String name=rs.getString("employee");
				double salary=rs.getDouble("sal");
				System.out.println(name+","+salary);
			}
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

		return b;
	}
}