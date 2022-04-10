<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@page isErrorPage="true" %>   <%--这里设置isErrorPage为true后，结合下面的小脚本块可在后台打印错误信息，不写只显示错误页面，程序员就不知道是哪的错 --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>自定义异常页面</title>
</head>
<body>
	<font size="6px" color="red">页面出错了，请联系管理员。</font>
	<% exception.printStackTrace(); %>   <%--在后台打印错误信息--%>
</body>
</html>