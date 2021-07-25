/*使用PreparedStatement这中操作对象类，解决sql注入问题的范例
  注意PS的sql框架语句的写法，问号的用法
 
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
		
		//控制台接受用户输入信息
		Scanner scan=new Scanner(System.in);
		System.out.print("请输入用户名:");
		String userName=scan.nextLine();
		System.out.print("请输入密码：");
		String pw=scan.nextLine();

		Map<String,String>  userInfo=new HashMap<>();
		userInfo.put("userName",userName);
		userInfo.put("pw",pw);

		return userInfo;
	}

	//登录方法，查看数据库中是否存在用户及其密码
	public static boolean login(Map<String,String> userInfo){
		
		//获取HashMap集合中的用户信息
		String userName=userInfo.get("userName");
		String pw=userInfo.get("pw");
		
		Connection connect=null;
		PreparedStatement ps=null;
		ResultSet rs=null;

		boolean loginSuccess=false;  //这里打标记，loginSuccess默认值为false,如果第五步if不成立，则返回false
		try{
			//JDBC链接数据库
			//第一步：注册驱动
			Class c=Class.forName("com.mysql.jdbc.Driver");

			//第二步，获取链接
			String url="jdbc:mysql://localhost:3306/grade";
			String user="root";
			String password="nicholas1200";
			connect=DriverManager.getConnection(url,user,password);

			//第三步，获取操作数据库的对象类 PreparedStaement,这里搭好SQL语句的框架，用户输入的任何信息只能是数据而不是SQL语句
			//问号？为占位符，将来接受用户输入的信息
			String sql="select name,password from t_class where name=? and password=?";
			ps=connect.prepareStatement(sql);  //注意方法名prepare是动词，不是形容词prepared
			
			//给占位符，即问号？传值
			ps.setString(1,userName);  //JDBC中第一个起始下标是1，即第一个问号为1							
			ps.setString(2,pw);
			//注意，传值要写在executeQuery()之前，否则数据不全则无法查询
            
			//第四步，执行操作，注意这里executeQuery()是无参方法，返回值也是ResultSet
			rs=ps.executeQuery();
			

			//第五步，处理查询结果集
			//如果rs.next()为真，则说明where语句成立，表中有对应的用户名，密码，就把loginSuccess赋值为true
			if(rs.next()){
				loginSuccess=true;
				System.out.println("登陆成功");
			}else{
				System.out.println("登录失败，用户名或密码不正确");   //如果if中没有return语句，则“登录失败”信息要写在else语句之中
			}

			

		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			
			//第六步，关闭并释放资源
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

		
		return loginSuccess;   //如果第五步if语句不成立，这里返回默认值false;
	}

}