/*JDBC演示事务机制范例，本例演示了JDBC中sql语句是自动提交的，实际应用时易造成数据丢失。009演示手动提交
  注意setString(..),setDouble(..)等有参方法是子类 PreparedStatement里特有的，
  不能声明Statement ps来调用子类特有的方法，需向下转型
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
		
		ResourceBundle bundle=ResourceBundle.getBundle("com/javase/jdbc/transactionFile"); //绑定porperties配置文件，注意文件不要加properties后缀
		String driver=bundle.getString("driver");     //从配置文件获取驱动名字
		String url=bundle.getString("url");			  //获取url
		String user=bundle.getString("user");         //获取用户名
		String password=bundle.getString("password"); //获取密码
		
		Connection connect=null;
		PreparedStatement ps=null;
		
		int count=0;
		try{
			//第一步，注册驱动
			Class c=Class.forName(driver);

			//第二步，获取数据库链接
			connect=DriverManager.getConnection(url,user,password);

			//第三步，获取操作数据库类的对象
			ps=connect.prepareStatement("update account set balance=? where accountno=?");
			ps.setDouble(1,10000);   //在mysql中如果输入int类型10000自动转换为double类10000.00
			ps.setInt(2,202101);     

			//第四步，执行操作
			count+=ps.executeUpdate();

		    String str=null;   //这里模拟出现异常，则下面的语句不会执行,上面的sql语句减去10000后没有加到202102账户中
			str.toString();
            
			//输入数据到账户202102，再一次执行操作
			ps.setDouble(1,10000.00);
			ps.setInt(2,202102);
			
			count+=ps.executeUpdate();   //count进行累加，如果为2则说明从账户202101转到202102的操作成功，否则失败
			
			String ifSuccess=(count==2) ? "转账成功" :"转账失败";
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