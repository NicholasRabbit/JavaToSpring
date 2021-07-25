<%@page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="com.springmvc.bean.User" %>   <%--导入User类 --%>
<html>
	<h3>登陆成功！</h3>
<% 
   /*由于HttpSession是jsp内置九大类之一，所以可直接获取从上一个页面发过来的HttpSession对象，名字就是session,可直接用
   */
   out.print(session);  //获取HttpSession对象，因为重定向并没有关闭页面，故可用HttpSession,重定向是两次请求，不可用HttpServletRequest
   User user01=(User)session.getAttribute("user01");
%>
<br><br>
<font size="3px" color="red">欢迎<%=user01.getUsername() %>登陆!</font>

<%-- <% //销毁session对象，如果销毁，再刷新登陆成功报错，因为没有session了，NullPointerException,仅为复习，可不写
	if(session != null){
		session.invalidate();
	}
%> --%>

</html>