<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%--JSP的本质就是在html语言中融入java程序，使其看起来又不那么突兀--%>

<%--JSP九个内置类范围中，前四个范围比较
	
	pageContext     javax.servlet.jsp.PageContext				页面范围
	request			javax.servlet.http.HttpServletRequest		请求范围		
	session			javax.servlet.http.HttpSession				会话范围
	application		javax.servlet.ServletContext				应用范围

	out				javax.servlet.jsp.JspWriter					输出到页面
	response		javax.servlet.http.HttpServletResponse		响应

	config			javax.servlet.ServletConfig							

	exception		java.lang.Throwable
	page			javax.servlet.HttpServlet;
--%>

<%=pageContext %>   <br>
<%=request%>		<br>
<%=session%>		<br>
<%=application%>	<br>



<%	
	String pageContextValue="pageContextValue";
	pageContext.setAttribute("pageContextKey",pageContextValue); //注意有参中第二个参数是Object类型
%>
	

<%
	String requestValue="requestValue";
	request.setAttribute("requestKey",requestValue);
%>

<%
	session.setAttribute("sessionKey","sessionValue");
%>

<%
	application.setAttribute("contextKey","contextKey");
%>

<%//转发
	request.getRequestDispatcher("/jspPages/jspInnerClassesCompare_B.jsp").forward(request,response);
%>