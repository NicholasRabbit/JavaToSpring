package com.javaweb.servlet;

import javax.servlet.Servlet;
import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.PrintWriter;
import java.io.IOException;

/*重定向redirect代码范例
一，重定向redirect和请求转发器RequestDispatcher的区别
	转发的特点：                                    
		-转发器由请求对象调用：request.getRequestDiapatcher("/b").forward(request,response) 
		-转发是一次请求里的，浏览器地址栏始终时显示“/project01/a”的路径，而不是"project01/b"
		-转发器资源路径，即方法实际参数列表内，不用写项目名，
		-转发是一次请求，只在项目内部跳转
	重定向特点：
		-重定向由响应对象调用：response.sendRedirect("/projectB/b")；
		-重定向是两次次请求，浏览器地址栏内路径会由"/projectA/a"改变为“/projectB/b”,项目名变了
		-重定向的资源路径要写项目名contextPath
		-重定向是跨项目跳转的。
二，由上可知论点：浏览器内点击超链接，始终是在一个请求里说法错误
    因为点击超链接可访问AServlet路径，而AServlet里可能会重定向跳转的另一个项目请求BServlet里面
三，总结：
*/
public class RedirectTest_A extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
			response.setContentType("text/html;charset=UTF-8");
			PrintWriter out=response.getWriter();

			request.setAttribute("user",new User("Tom",8002));
			
			Object user=request.getAttribute("user");
			System.out.println("A:"+user);  //Tomcat界面输出：A:{Tom=8002}，Tomcat界面输出，验证已加进去了属性
                                            //但是重定向到B之后输出null，说明A和B对应不同的请求对象
			
			//重定向方法void sendRedirect(String location) throws IOException，由response调用
			try{
				response.sendRedirect("/A018-RedirectTest/user/b");  //这里写路径名，要带有项目名，注意不可写<servlet-class>类名
			}catch(IOException e){
				e.printStackTrace();
			}

	}
}

class User {
	private String name;
	private int id;
	public User(){
	
	}
	public User(String name, int id){
		this.name=name;
		this.id=id;
	}

	public String toString(){
		return "{"+this.name+"="+this.id+"}";
	}

	//复习如何重写equals()方法
	public boolean equals(Object obj){
		if(obj == null | !(obj instanceof User)){
			return false;
		}else if(this==obj){
			return true;
		}

		User u=(User)obj;
		if(this.name.equals(u.name) & this.id==u.id){
			return true;
		}

		return false;
	}
}