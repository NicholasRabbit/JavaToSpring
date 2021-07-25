package com.javaweb.servlet;

import javax.servlet.Servlet;
import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.PrintWriter;
import java.io.IOException;

/*第一种方案：万能方案，可解决任何乱码
  (1)浏览器传送的数据是ISO-8859-1格式，不支持中文，如果注册表单中输入中文名则后端服务器会出现乱码
  (2)解决方案：把传输到服务器的数据按照原格式ISO-8859-1接收，编码(即分解成最小单位byte)，即把最原始的二进制单位存进byte[]数组中，
     然后解码，即转码成utf-8格式即可
  (3)本范例解决这种数据传输中的乱码问题
*/

public class HttpServletRequestTest005 extends HttpServlet{

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String userName=request.getParameter("userName");
		String password=request.getParameter("passwd");
		
		byte[] bytes=userName.getBytes("ISO-8859-1");   //因为原数据是ISO-8859-1格式的，所以这里按照其格式存进数组里
		userName=new String(bytes,"UTF-8");   //创建新字符串，并按照UTF-8格式转码存进去
		System.out.println(userName);         //注意这里解码格式要和html文件原始的编码格式(例如：UTF-8)一致，否则还是会乱码
	}

   /*第二种方案，只能解决post请求中的乱码，并且只针对请求体中的数据，无法解决请求行内的数据乱码
     本方案代码需写在doPost(..)方法里面，以下是错误示范写在doGet(..)方法里，试着推翻结论，推翻不了
   */
   public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//调用request对象中的setCharactorEncoding("UTF-8")方法解决
		request.setCharacterEncoding("UTF-8");  //此方法必须写在获取请求之前，否则无效
		String name=request.getParameter("userName");
		System.out.println(name);   //这里不输出，因为代码需写在doPost()里面，且浏览器必须是发送的post请求才行
   }
   
   /*第三种解决方案，修改CATALINA_HOME/conf/server.xml文件内相关参数
    <Connector port="80" protocol="HTTP/1.1"
			               connectionTimeout="20000"
			               redirectPort="8443"
						   URIEncoding="UTF-8"/>
	以下为引申知识点servler.xml文件中其他参数的设置：				
					- server.xml文件中的Connector标签中可以编写什么属性呢？
						* 参考：C:\tomcat7\webapps\docs\config\http.html
						* port 设置端口号
						* URIEncoding 设置URI的编码方式
						* maxThreads 设置Tomcat服务器可支持的最大线程数量
						* ....
   */
}