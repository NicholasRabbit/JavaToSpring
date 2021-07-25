/*JDBC演示事务机制范例，本例使用手动提交
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
		   //第一步，注册驱动
		   Class c=Class.forName("com.mysql.jdbc.Driver");

		   //第二步，获取链接
		   connect=DriverManager.getConnection("jdbc:mysql://localhost:3306/bank","root","nicholas1200");
           //关闭自动提交，改为手动提交模式
		   connect.setAutoCommit(false);
		   
		   //第三步，获取操作数据库类对象
		   ps=connect.prepareStatement("update account set balance=? where accountno=?");
		   ps.setDouble(1,10000);
		   ps.setInt(2,202101);
		   count+=ps.executeUpdate();

		   //String str=null;    //此处运行时空指针异常，打断程序向下执行
		   //str.toString();

		   ps.setDouble(1,10000);   //向202102账户内加10000圆
		   ps.setInt(2,202102);
		   count+=ps.executeUpdate();

		   String ifSuccess=(count==2) ? "转账成功" : "转账失败";
		   System.out.println(ifSuccess);

		   connect.commit();   //上面两个账户的操作执行完才在这里手动提交
		   
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
					connect.rollback();   //回滚, 放到finally中，则一定会执行
					connect.close();
				}catch(SQLException e){
					e.printStackTrace();
				}
			}
		}
		
		return count;

	}

}