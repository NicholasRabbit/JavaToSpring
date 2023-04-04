import javax.servlet.ServletException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.PrintWriter;
import java.io.IOException;

//这里为了研究其原理，先继承个人仿写的HttpServletMock,以后都继承SUN自带的HttpServlet类
public class LoginTest extends HttpServletMock {

	/*(1)因为Login要求提交表单时要求时post方法，所以这里只覆盖重写HttpServletMoc模板类里的doPost()方法，
	  (2)父类的doGet(),service()方法都不重写，这样Tomcat使用多态语法调用doPost()时调用这里子类里的，
	  (3)如果判断时get请求，通过父类HttpServlet里的if语句判断,执行调用未重写doGet()方法，即可显示错误提示
	  (4)注意体会HttpServletMock这个模板，它让子类LoginTest的代码简洁了
	*/
	
	//实际效果来讲，子类中的doPost()或doGet()方法等同于main()方法的作用
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {   
		
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out=response.getWriter();
		out.print("登录成功!");
		
		//记得刷新和关闭流
		out.flush();
		out.close();
		
	}
}