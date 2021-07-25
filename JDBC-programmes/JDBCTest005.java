/*PreparedStatement���ݿ������������÷�������ע����Statement�Ƚ�
  (1)ʹ��������ԭ���Ƿ�ֹsqlע������⣬ʹ��Statement�����׷���sqlע�룬����©��������ȫ
  (2)������ʹ��Statement�࣬��ʾsqlע������
  (3)ע��ѧϰ���û���Ϣ�Ž�Map�����ڵ�˼·
  (4)ע�����sqlע��������д��
*/

import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class JDBCTest005 {

	public static void main(String[] args){
	    
		Map<String,String> userInfo=userInterface();
		
		login(userInfo);
	}

	
	//���û���������Ž�Map��������,����
	public static Map<String,String> userInterface(){
		
		//dos��������û���������ֺ�����
		Scanner s=new Scanner(System.in);
		System.out.print("�������û���:");
		String userName=s.nextLine();
		System.out.print("����������: ");
		String pw=s.nextLine();
		
		Map<String,String>  userInfo=new HashMap<String,String>();
		userInfo.put("userName",userName);
		userInfo.put("password",pw);

		return userInfo;

	}


	
	public static void login(Map<String,String> userInfo){
	
		String userName=userInfo.get("userName");
		String password=userInfo.get("password");

		Connection connect=null;
		Statement state=null;
		ResultSet rs=null;
   
		try{
			//��һ����ע�����ݿ�����
			Class c=Class.forName("com.mysql.jdbc.Driver");

			//�ڶ�������ȡ���ݿ�����
			String url="jdbc:mysql://localhost:3306/mydatabase";
			String user="root";
			String pwSql="nicholas1200";
			connect=DriverManager.getConnection(url,user,pwSql);

			//����������ȡ�������ݿ�Ķ���
			state=connect.createStatement();

			/*���Ĳ���ִ�в���,ע������sql�����©�����ᷢ��sqlע������
			  sqlע�뷶���������¸�ʽ���룬where�л���..or '2'='2'
			  �����ĺ��ʽ����������ʲô���ֶ��ɵ�¼�ɹ�
			  "�������û���:aaa
               ����������: aaa' or '2'='2   //���밴�˸�ʽ���룬ͨ��sql�����ŵĹ���������е�or����sql����ˣ�
               ��¼�ɹ�"

			*/
			rs=state.executeQuery("select name,password from userlogin where name ='"+userName+"' and password= '"+password+"'");

			//���岽����ȡ��ѯ�����,���ж��Ƿ��н��������в�ѯ����Ļ���˵������where�����������û���������ȷ
		    if(rs.next()){
				System.out.println("��¼�ɹ�");
				return;
			}

			System.out.println("�û������������");

		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			if(rs !=null){
				try{
					rs.close();
				}catch(SQLException e){
			        e.printStackTrace();
		        }
			}
			if(state !=null){
				try{
					state.close();
				}catch(SQLException e){
			        e.printStackTrace();
		        }
			}
			if(connect !=null){
				try{
					connect.close();
				}catch(SQLException e){
			        e.printStackTrace();
		        }
			}
		}
	}

}