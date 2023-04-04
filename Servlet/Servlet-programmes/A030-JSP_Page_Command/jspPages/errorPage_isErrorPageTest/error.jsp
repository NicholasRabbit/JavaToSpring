<%@page contentType="text/html;charset=UTF-8"%>
<%@page isErrorPage="true"%>
内部程序错误，请联系管理员！

<%
	exception.printStackTrace();
%>