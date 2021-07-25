import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;

public class JDBCTest001 {

	public static void main(String[] args){
		
		Connection connect=null;
		Statement state=null;
		try{
		   //JDBC编程步骤;
    	   //第一步，注册驱动，告诉jvm要连接哪种数据库
		   Driver driver=new com.mysql.jdbc.Driver();  //这里是多态，前面那个Driver是java中的接口，后面是mysql的实现类
		   DriverManager.registerDriver(driver);    //调用DriverManager中的静态方法，把driver对象注册进去			
		   
		   //第二步，获取链接，即通过url，用户名，密码来链接,这三者都是String类型,返回值是mysql实现类的Connection对象
		   String url="jdbc:mysql://192.168.0.102:3306/mydatabase";
		   String user="root";
		   String password="nicholas1200";
		   connect=DriverManager.getConnection(url,user,password);  //这里获取的是mysql实现类对象
		   System.out.println("数据库链接对象："+connect);  //输出：数据库链接对象：com.mysql.jdbc.JDBC4Connection@41cf53f9

		   //第三步，调用connect对象的方法操作数据库,即执行sql语句,
		   state=connect.createStatement();  //这个state指向的也是mysql的实现类StatementImpl
		   System.out.println(state);                  //输出：com.mysql.jdbc.StatementImpl@5a10411 
           
		   /*第四步，执行sql语句，指用state对象调用execute(..)方法来输出sql语句
		             返回值指影响数据库中记录条数
		   */      
		   int i=state.executeUpdate("insert into t_class (name,age) values ('Jerry',17) ");
		   System.out.println(i);
               //(1)java中写mysql语句不用加分号“；”  (2)注意sql语句中字符创类型数据还是加单引号:''
                                                                 
		   //第五步，处理查询结果，只针对第四步是执行select语句时的情况

		}catch(SQLException e){
		   e.printStackTrace();
		}finally{
		   	
			/*第六步，关闭进程，释放资源
			  注意问题:(1)从小到大依次关闭   Statement小-->大Connecttion
					   (2)不同资源分开try{},因为在try语句中，有一个抛异常，则其下面语句不执行了，也就无法释放了
			*/
			if(state !=null){
			   try{
			      state.close();
			   }catch(SQLException e){
				  e.printStackTrace();
			   }
			}
			if(connect!=null){
			   try{
			     connect.close();
			   }catch(SQLException e){
				  e.printStackTrace();
			   }
			}

		}
		
	}

}