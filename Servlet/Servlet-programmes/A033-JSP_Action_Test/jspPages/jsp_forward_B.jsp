<%@page contentType="text/html;charset=UTF-8"%>

<%
	Object nameObj=request.getAttribute("name");
	out.print(nameObj);
%>