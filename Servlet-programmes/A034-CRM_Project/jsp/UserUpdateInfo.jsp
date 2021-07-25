<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.List" %>
<%@page import="java.util.ArrayList" %>
<%@page import="com.javaweb.entity.User"%>

<html>

<%
	ArrayList myList=(ArrayList)request.getAttribute("u01");
	User u=(User)myList.get(0);
%>

<form action="/A034-CRM_Project/update" method="POST">
	ID:<input type="hidden" name="idNum"  value="<%=u.getId()%>" />  <br> <!--这个信息不在网页显示，因为id是系统给定的，不要让客户自行修改-->
	用户名 <input type="text" name="name" value="<%=u.getName()%>"/>	<br>
	性别<input type="radio"  name="gender" value="m" >男</input> <input type="radio" name="gender" value="f">女</input>	<br>
	电话<input type="text" name="tel" value="<% out.print(u.getTel()); %>"></input> <br>
	地址<input type="text" name="addr" value="<% out.print(u.getAddr()); %>"></input>  <br>
	    <input type="submit" value="确认修改"/> &nbsp <input type="reset" value="清空"></input>	<br>
</form>




</html>

