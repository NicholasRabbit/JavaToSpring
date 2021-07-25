<%@page language="java" contentType="text/html;charset=UTF-8"%>
<html>
<head>
	<title>测试ServletAPI,HttpServletRequest,HttpServletResponse等等</title>
</head>

<body>
	<font size="4px" color="black">ServletAPI测试</font>
	<form action="/SpringMVCTest004/servlet"  method="post">
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
</body>
</html>