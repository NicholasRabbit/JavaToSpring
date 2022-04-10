//���岽�������ѯ���������ϰ��ǰ���ǵ��Ĳ�����ִ��select���
//ע��select�����name as n�ñ����� getString("n")�����Ķ�Ӧ����

import java.util.ResourceBundle;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;


public class JDBCTest004 {

	public static void main(String[] args){
	
		ResourceBundle bundle=ResourceBundle.getBundle("com/javase/jdbc/info");
		String database=bundle.getString("database");
		String url=bundle.getString("url");
		String user=bundle.getString("user");
		String password=bundle.getString("password");
		
		Connection connect=null;
		Statement state=null;
		ResultSet rs=null;

		try{
			//��һ����ע������
			Class c=Class.forName(database);

			//�ڶ�������ȡ����
			connect=DriverManager.getConnection(url,user,password);

			//����������ȡ�������ݿ��Ķ���Statement
			state=connect.createStatement();

			//���Ĳ���ִ��sql���            //����name��������
			rs=state.executeQuery("select num,name as n,age from t_class");   //����ֵʱResultSet�࣬���������˳���ͷ���������Ҫ��ѯ������

			/*���岽�������ѯ��������� ResultSet rs��Ľ��
			  �õ�������ڶ���rs���ʼ�и���ͷָ���һ�е����棬ûִ��һ��next()����������һ�У�ֱ��û���У��ͷ���false
			*/
			
			
			rs.next();                    //��ͷ����һ��  
			String num=rs.getString(1);   //(1)ͨ��ResultSet���getString(���±�)�ķ�����ȡֵ����ͨ������ÿ�����е��±�  
			String name=rs.getString(2);  //(2)ע��jdbc���±���1��ʼ������0
			String age=rs.getString(3);   //(3)���ַ�ʽ��ͨ�ã������ƶ�λ��ʱ�����±��Ӧ��ֵҲ��ı䣬�����׼ȷ��
			System.out.println(num+","+name+","+age);
			
			//getString()�����ǰѱ������е�����ת��ΪString���ͣ�������
			//Ҳ��ͨ����������ȡֵ��ͬʱҲ���Ե���getInt(..)������ȡint���͵�ֵ��ע����������Ҫ��Ӧ��

			rs.next();                       //��ͷ������һ��
			int num02=rs.getInt("num");      
			String name02=rs.getString("n");  //��������SQL���������name�ĳ��˱���n,�������ҲҪһ�£����򱨴� 
			int age02=rs.getInt("age");  
			System.out.println(num02+","+name02+","+age02);
			

			//���ϴ����ͨ��whileѭ��ʵ�֣��ɸ����
			/*
			while(rs.next()){
			   String num=rs.getString(1);
			   String name=rs.getString(2);
			   String age=rs.getString(3);
			   System.out.println(num+","+name+","+age);
			}
			*/
			
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			
			//���������ر���Դ���Դ˴�С����رգ��ֿ�try����ֹ����Ӱ��
			if(rs != null){
				try{
					rs.close();
				}catch(SQLException e){
					e.printStackTrace();
				}
			}
			if(state != null){
				try{
					state.close();
				}catch(SQLException e){
					e.printStackTrace();
				}
			}if(connect != null){
				try{
					connect.close();
				}catch(SQLException e){
					e.printStackTrace();
				}
			}
		}
	}

}