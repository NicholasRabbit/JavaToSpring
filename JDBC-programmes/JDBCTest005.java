/*PreparedStatement数据库操作对象类的用法范例，注意与Statement比较
  (1)使用这个类的原因是防止sql注入的问题，使用Statement类容易发生sql注入，即有漏洞，不安全
  (2)本例先使用Statement类，演示sql注入问题
  (3)注意学习把用户信息放进Map集合内的思路
  (4)注意造成sql注入的密码的写法
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

	
	//把用户名，密码放进Map集合里面,待用
	public static Map<String,String> userInterface(){
		
		//dos界面接受用户输入的名字和密码
		Scanner s=new Scanner(System.in);
		System.out.print("请输入用户名:");
		String userName=s.nextLine();
		System.out.print("请输入密码: ");
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
			//第一步，注册数据库驱动
			Class c=Class.forName("com.mysql.jdbc.Driver");

			//第二步，获取数据库链接
			String url="jdbc:mysql://localhost:3306/mydatabase";
			String user="root";
			String pwSql="nicholas1200";
			connect=DriverManager.getConnection(url,user,pwSql);

			//第三步，获取操作数据库的对象
			state=connect.createStatement();

			/*第四步，执行操作,注意这里sql语句有漏洞，会发生sql注入问题
			  sql注入范例，按如下格式输入，where中会有..or '2'='2'
			  这样的恒等式，所以无论什么名字都可登录成功
			  "请输入用户名:aaa
               请输入密码: aaa' or '2'='2   //密码按此格式输入，通过sql单引号的规则把密码中的or当做sql语句了，
               登录成功"

			*/
			rs=state.executeQuery("select name,password from userlogin where name ='"+userName+"' and password= '"+password+"'");

			//第五步，获取查询结果集,并判断是否有结果，如果有查询结果的话，说明上面where语句成立，则用户名密码正确
		    if(rs.next()){
				System.out.println("登录成功");
				return;
			}

			System.out.println("用户名或密码错误");

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