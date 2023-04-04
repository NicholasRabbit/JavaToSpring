import javax.servlet.Servlet;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import javax.servlet.ServletException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

//个人仿写SUN的HttpServlet类，研究其用法。
public class HttpServletMock extends GenericServletTest {


	//重写的GenericServletTest的方法
	public void service(ServletRequest req, ServletResponse res) throws ServletException,IOException {
		
		HttpServletRequest request=(HttpServletRequest)req;    //Tomcat服务器传来的是多态语法中的req和res，需向下转型
		HttpServletResponse response=(HttpServletResponse)res; 
		
		service(request,response);   //本类里实例方法调用，实际省略了this,即this.service(request,response)

	}

	//新写的一个 service()方法，放到原始的service()里调用，形参列表不同,为了以后用HttpServletRequest/Response等
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException {
	    
		String method=request.getMethod();

		if("POST".equals(method)){
			doPost(request,response);
		}else if("GET".equals(method)){
			doGet(request,response);
		}
	}

	//原先个人这里doPost(),doGet()方法是无参的，无法获取ServletRequest,ServletResponse对象，要改
	//因为子类要用的response.setContentType(..)设置编码格式
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException{   
		
		response.setContentType("text/html;charset=UTF-8");  //设置编码格式要在获取PrintWriter对象之前，否则无效

		//设置好编码格式，否则浏览器乱码
		PrintWriter out=response.getWriter();
		out=response.getWriter();

		//如果要求是提交POST请求，则子类LoginTest.java重写此方法，改为正确提示，见LoginTest.java代码
		out.print("405错误，你应该使用get请求方法");        //这里给客户提示
		throw new RuntimeException("客户端应使用get请求");  //这里手动抛一个运行时异常，给程序员看
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException{
		
		response.setContentType("text/html;charset=UTF-8");
		
		//同样的，这个方法也要设置编码，因为每次请求只会调用doPost()或doGet()其中一个
		PrintWriter out=response.getWriter();
		out=response.getWriter();
		out.print("405错误，你应该使用post请求方法");
		throw new RuntimeException("客户端应使用post请求");
	}
}