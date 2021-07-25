/*需要SQL注入的情况范例，如用户要求排序商品价格等，在控制台输入desc或asc这些词则必须被当作sql语句才可
   本例被注释的Statement是正确方式，没注释的是验证PreparedStatement类不适用商品排序
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
		System.out.print("请输入排序规则(asc是升序，desc是降序):");
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
			//第一步，注册驱动
			Class c=Class.forName("com.mysql.jdbc.Driver");
			
			//第二步，获取链接对象Connection
			String url="jdbc:mysql://localhost:3306/company";
			String user="root";
			String password="nicholas1200";
			connect =DriverManager.getConnection(url,user,password);
			
			//第三步，获取操作数据库类的对象
			//state=connect.createStatement();
			String sql="select ename as employee,sal from emp order by sal ?";
			ps=connect.prepareStatement(sql);
			ps.setString(1,custom);

			//第四步，执行操作
			//String sql="select ename as employee,sal from emp order by sal "+custom;   //注意双引号内最后加空格，否则最后一个词sal就和custom挨住并成为一个词了，报错
			//rs=state.executeQuery(sql);
			rs=ps.executeQuery();

			//第五步，处理查询结果集
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