/*ʹ��PreparedStatement���в��������࣬���sqlע������ķ���
  ע��PS��sql�������д�����ʺŵ��÷�
 
*/

import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.SQLException;



public class JDBCTest006 {

	public static void main(String[] args){
		
		Map<String,String> userInfo=userInterface();
		login(userInfo);
	}

	public static Map<String,String>  userInterface(){
		
		//����̨�����û�������Ϣ
		Scanner scan=new Scanner(System.in);
		System.out.print("�������û���:");
		String userName=scan.nextLine();
		System.out.print("���������룺");
		String pw=scan.nextLine();

		Map<String,String>  userInfo=new HashMap<>();
		userInfo.put("userName",userName);
		userInfo.put("pw",pw);

		return userInfo;
	}

	//��¼�������鿴���ݿ����Ƿ�����û���������
	public static boolean login(Map<String,String> userInfo){
		
		//��ȡHashMap�����е��û���Ϣ
		String userName=userInfo.get("userName");
		String pw=userInfo.get("pw");
		
		Connection connect=null;
		PreparedStatement ps=null;
		ResultSet rs=null;

		boolean loginSuccess=false;  //������ǣ�loginSuccessĬ��ֵΪfalse,������岽if���������򷵻�false
		try{
			//JDBC�������ݿ�
			//��һ����ע������
			Class c=Class.forName("com.mysql.jdbc.Driver");

			//�ڶ�������ȡ����
			String url="jdbc:mysql://localhost:3306/grade";
			String user="root";
			String password="nicholas1200";
			connect=DriverManager.getConnection(url,user,password);

			//����������ȡ�������ݿ�Ķ����� PreparedStaement,������SQL���Ŀ�ܣ��û�������κ���Ϣֻ�������ݶ�����SQL���
			//�ʺţ�Ϊռλ�������������û��������Ϣ
			String sql="select name,password from t_class where name=? and password=?";
			ps=connect.prepareStatement(sql);  //ע�ⷽ����prepare�Ƕ��ʣ��������ݴ�prepared
			
			//��ռλ�������ʺţ���ֵ
			ps.setString(1,userName);  //JDBC�е�һ����ʼ�±���1������һ���ʺ�Ϊ1							
			ps.setString(2,pw);
			//ע�⣬��ֵҪд��executeQuery()֮ǰ���������ݲ�ȫ���޷���ѯ
            
			//���Ĳ���ִ�в�����ע������executeQuery()���޲η���������ֵҲ��ResultSet
			rs=ps.executeQuery();
			

			//���岽�������ѯ�����
			//���rs.next()Ϊ�棬��˵��where�������������ж�Ӧ���û��������룬�Ͱ�loginSuccess��ֵΪtrue
			if(rs.next()){
				loginSuccess=true;
				System.out.println("��½�ɹ�");
			}else{
				System.out.println("��¼ʧ�ܣ��û��������벻��ȷ");   //���if��û��return��䣬�򡰵�¼ʧ�ܡ���ϢҪд��else���֮��
			}

			

		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			
			//���������رղ��ͷ���Դ
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

		
		return loginSuccess;   //������岽if��䲻���������ﷵ��Ĭ��ֵfalse;
	}

}