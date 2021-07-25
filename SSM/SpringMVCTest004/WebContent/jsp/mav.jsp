<%@page language="java" contentType="text/html;charset=UTF-8" %>
<html>
<head>
	<title>ModelAndView用法</title>
</head>

<body>
	<font size="4px" color="black">ModelAndView方式</font>    <br>
	<form action="/SpringMVCTest004/mav"  method="post">
		用户名<input type="text" name="username"></input> <br>
		密码<input type="password" name="password"></input> <br>
		<input type="submit" value="确认"/> <input type="reset" name="重置"></input>  <br>
	</form>
	
	<font size="4px" color="black">Map方式</font>    <br>
	<form action="/SpringMVCTest004/map"  method="post">
		用户名<input type="text" name="username"></input> <br>
		密码<input type="password" name="password"></input> <br>
		<input type="submit" value="确认"/> <input type="reset" name="重置"></input>  <br>
	</form>
	
	<font size="4px" color="black">Model方式</font>    <br>
	<form action="/SpringMVCTest004/model"  method="post">
		用户名<input type="text" name="username"></input> <br>
		密码<input type="password" name="password"></input> <br>
		<input type="submit" value="确认"/> <input type="reset" name="重置"></input>  <br>
	</form>
</body>
</html>