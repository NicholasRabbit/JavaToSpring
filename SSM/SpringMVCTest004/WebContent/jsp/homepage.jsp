<%@page language="java" contentType="text/html"  pageEncoding="UTF-8" %>
<html>
<head>
	<title>默认欢迎页面</title>
</head>

<body>
	<font size="4px" color="black">测试@RequestParam注解</font>
	<form action="/SpringMVCTest004/param"  method="post">
		<table>
			<tr>
				 <td>用户名</td>  <td><input type="text" name="username"></input></td>
			</tr>
			<tr>
				<td>密码</td>   <td><input type="password" name="password"></input></td>
			</tr>
			<tr align="center">
				<td><input type="submit" value="确认"/></td>   <td><input type="reset" name="重置"></input></td>  
			</tr>  
		</table> 
	</form> 
	
	
	<font size="4px" color="black">测试@RequestHeader注解</font>    <br>
	<form action="/SpringMVCTest004/header"  method="post">
		
		<table>
			<tr>
				 <td>用户名</td>  <td><input type="text" name="username"></input></td>
			</tr>
			<tr>
				<td>密码</td>   <td><input type="password" name="password"></input></td>
			</tr>
			<tr align="center">
				<td><input type="submit" value="确认"/></td>   <td><input type="reset" name="重置"></input></td>
			</tr>
		</table>
	</form>
	
	<font size="4px" color="black">测试@CookieValue注解</font>    <br>
	<form action="/SpringMVCTest004/cookie"  method="post">
		
		<table>
			<tr>
				 <td>用户名</td>  <td><input type="text" name="username"></input></td>
			</tr>
			<tr>
				<td>密码</td>   <td><input type="password" name="password"></input></td>
			</tr>
			<tr align="center">
				<td><input type="submit" value="确认"/></td>   <td><input type="reset" name="重置"></input></td>
			</tr>
		</table>
	</form>
	
	<a href="/SpringMVCTest004/jsp/servletapi.jsp">测试ServletAPI,HttpServletRequest,HttpServletResponse等等</a>  <br>
	
	<a href="/SpringMVCTest004/jsp/mav.jsp">测试ModelAndView用法</a>   <br> <br>
	
	<hr>
	
	<!-- 重定向测试 -->
	<font size="4px" color="black">重定向</font>    <br>
	<form action="/SpringMVCTest004/redirect"  method="post">
		用户名<input type="text" name="username"></input> <br>
		密码<input type="password" name="password"></input> <br>
		<input type="submit" value="确认"/> <input type="reset" name="重置"></input>  <br>
	</form>
	
</body>
</html>