import javax.servlet.Servlet;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import javax.servlet.ServletException;

import javax.servlet.http.HttpServletRequest;

import java.io.IOException;
import java.io.PrintWriter;

/*
1，本例先不写模板类HttpServlet
2，只写Login.java, Logout.java直接继承Generic;
3，这种写法代码麻烦，仅与写HttpServlet的项目对比用，体会差别；
4，本例这种写法，Login.java里要写一边判断是get或post,而Logout.java里要判断是get或post,代码重复
*/

public class LoginTest001 extends GenericServletTest002 {

	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		//第一步，先获取请求的方法是get,还是post，
		//调用ServletRequest的子类HttpServletRequest里特有的方法String getMethod(),需向下转型，多态语法要求
		HttpServletRequest request=(HttpServletRequest)req;
		String method=request.getMethod();

		res.setContentType("text/html;charset=utf-8");
		PrintWriter out=res.getWriter();

		out.println("service execute.");
		out.println("method:"+method);
		
		//第二部，进行判断
		if("POST".equals(method)){
			out.print("登陆成功！");
		}else{
			out.print("登录失败！提交表单须用post方法！");
		}

	}
}