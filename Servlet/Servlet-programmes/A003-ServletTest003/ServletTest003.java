import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.PrintWriter;

import javax.servlet.ServletException;

import java.io.IOException;

public class ServletTest003 implements Servlet {

	public void init(ServletConfig config) throws ServletException {
	
	}

	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		/*设置响应到浏览器的编码格式，因为Tomcat默认是ISO-8591-1不支持汉字，
		  调用ServletResponse接口里的方法setContentType(String type)。
		  Tomcat调用service(..)方法时，已经为该接口写了实现类,这里时多态用法
		*/
		res.setContentType("text/html;charset=UTF8");  //在getWriter()方法之前设置编码格式，否则不管用

		/*还是调用ServletResponse接口里的方法getWriter(..)返回一个PrintWriter对象，
		  其可向浏览时输出文本,浏览器可把文本进行编译，注意浏览器只可编译html,css,js
		*/
		PrintWriter out=res.getWriter();
        //调用PrintWriter对象里的方法，向浏览器输出文本，也称作响应(response)
		out.print("<html>");
		out.print("<head>");
		out.print("<title>");
		out.print("Hi earth");
		out.print("</title>");
		out.print("</head>");
		out.print("<body>");
		out.print("你好地球");
		out.print("</body>");
		out.print("</html>");
	}

	public ServletConfig getServletConfig(){
		return null;
	}

	public String getServletInfo(){
		return null;
	}

	public void destroy(){
	
	}
}