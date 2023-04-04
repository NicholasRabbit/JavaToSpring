<%@page contentType="text/html;charset=UTF-8"%>
<html>

<%--JSP中动作语法格式：
    <jsp:动作名  属性名=属性值 属性名=属性值……></jsp:动作名>
	(1)JSP动作设计的初衷，减少jsp页面中的java代码，因为jsp页面仅仅是作为展示的，夹杂过多java代码不美观
	 实际看来这种动作代码效果也不好 
	(2)jsp动作可翻译为相对应的java代码
	(3)常用动作：forward, include
--%>


<!--forward是一次请求，与servlet中request.getRequestDispatcher().forward(resquest,response)作用一样，可作为替代方案-->
<%
	String userName="Tom";
	request.setAttribute("name",userName);   //在请求对象中添加属性，来验证是否能在jspPage02.jsp中获取，从而验证jsp:forward动作是否为一次请求
%>
<jsp:forward page="/jspPages/jsp_forward_B.jsp"></jsp:forward>  <!--注意page属性路径是以项目根目录为起点，但不包含根目录-->
<!--底层生成了两个java程序jsp_forward_A .java和jsp_forward_B.java，跟servlet类似，就是从A转发到了B程序
-->

</html>