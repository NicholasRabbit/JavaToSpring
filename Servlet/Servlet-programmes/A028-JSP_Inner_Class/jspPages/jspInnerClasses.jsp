<%--
JSP九个内置对象练习
内置对象是指可以直接拿来用的对象，不用新建new

名称			完整类名
-------------------------
pageContext		javax.servlet.jsp.PageContext            页面范围的类(jsp独有，Servlet里没有),尽在当前页面使用(范围从小到大)
request			javax.servlet.http.HttpServletRequest    请求范围的类
session			javax.servlet.http.HttpSession		     会话范围的类
application		javax.servelt.ServletContext			 应用范围的类

out				javax.servlet.jsp.JspWriter			     输出流
response		javax.servlet.http.HttpServletResponse   响应

config			javax.servelt.ServletConfig

exception		java.lang.Throwable						异常

page			java.lang.Object  (page=this)			页面本身这个类，注意与上面的pageContext不一样
                javax.servlet.HttpServlet(page实际是这个)  即HttpJspPage >>> JspPage >>> HttpServlet

(1)这九个对象可在service(..)方法中直接使用；
(2)别的方法中可间接使用,通过穿参数等方式可以用；
(3)上面的变量名称就是默认的名称，即可以直接拿来使用，系统声明的就是这些名称
--%>

<%   //浏览器显示内容时，这里使用out.println()无法自动换行,out.print("\r\n")也无法换行,out.write("\r\n")也不可以换行
     //原因out.println,out.print("\r\n")和out.write("\r\n")的换行作用是体现在html源代码里面，而不是浏览器显示出来
out.print("pageContext="+pageContext);
%>
<br>
<%
out.print("request="+request);				
%>
<br>
<%
out.print("sessioin="+session);				
%>
<br>
<%
out.print("application="+application);		
%>
<br>
<%
out.print("out="+out);						
%>
<br>
<%
out.print("response="+response);
%>
<br>
<%
out.print("config="+config);				
%>
<br>
<%
//out.println("exception="+exception);  //异常对象暂时不用，后面讲
%>
<br>
<%
out.println("page"+page);
%>
<br>

<%
	out.write("Hello");
	out.write("\r\n");    //输出不可换行换行
	out.write("Again");
%>
<%--
输出结果：可以看到Tomcat的实现类的名字
pageContext=org.apache.jasper.runtime.PageContextImpl@5187c97e
request=org.apache.catalina.connector.RequestFacade@fffc5d
sessioin=org.apache.catalina.session.StandardSessionFacade@638f5f5a
application=org.apache.catalina.core.ApplicationContextFacade@2395cd2d
out=org.apache.jasper.runtime.JspWriterImpl@2f6ecb24
response=org.apache.catalina.connector.ResponseFacade@3a95b64b
config=org.apache.catalina.core.StandardWrapperFacade@23795bcc

pageorg.apache.jsp.jspPages.jspInnerClasses_jsp@3a46ee85 
--%>