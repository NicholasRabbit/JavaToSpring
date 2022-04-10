//第五步，处理查询结果集的练习，前提是第四步必须执行select语句
//注意select语句中name as n该别名后 getString("n")参数的对应问题

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
			//第一步，注册驱动
			Class c=Class.forName(database);

			//第二步，获取链接
			connect=DriverManager.getConnection(url,user,password);

			//第三步，获取操作数据库库的对象Statement
			state=connect.createStatement();

			//第四步，执行sql语句            //这里name改了名字
			rs=state.executeQuery("select num,name as n,age from t_class");   //返回值时ResultSet类，这个类包含了除表头以外的所有要查询的数据

			/*第五步，处理查询结果集，即 ResultSet rs里的结果
			  得到结果后，在对象rs里最开始有个箭头指向第一行的上面，没执行一次next()方法就下移一行，直到没有行，就返回false
			*/
			
			
			rs.next();                    //箭头下移一行  
			String num=rs.getString(1);   //(1)通过ResultSet里的getString(列下标)的方法获取值，即通过表中每行里列的下标  
			String name=rs.getString(2);  //(2)注意jdbc中下标以1开始，不是0
			String age=rs.getString(3);   //(3)这种方式不通用，当列移动位置时，则下标对应的值也会改变，结果不准确了
			System.out.println(num+","+name+","+age);
			
			//getString()方法是把表中所有的类型转换为String类型，并返回
			//也可通过列名来获取值，同时也可以调用getInt(..)方法获取int类型的值，注意数据类型要对应上

			rs.next();                       //箭头再下移一行
			int num02=rs.getInt("num");      
			String name02=rs.getString("n");  //由于上面SQL语句中列名name改成了别名n,这里参数也要一致，否则报错 
			int age02=rs.getInt("age");  
			System.out.println(num02+","+name02+","+age02);
			

			//以上代码可通过while循环实现，可更简洁
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
			
			//第六步，关闭资源，以此从小到大关闭，分开try，防止互相影响
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