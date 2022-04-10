<%@page language="java" contentType="text/html"  pageEncoding="UTF-8" %>

<html>
<head>
	<title>增加员工</title>
</head>

<link rel="stylesheet"  type="text/css" href="${pageContext.servletContext.contextPath}/css/index_work.css">

<body>
	<form  action="/SSMTest001/addSingle"  method="post">
		<input type="hidden" name="id"></input>
		<table>
			<tr>
				<th colspan="2">增加用户</th>
			</tr>
			<tr>
				<td>用户名</td>  <td> <input type="text"  name="ename"></input> </td>
			</tr>
			<tr>
				<td>性别</td>  
				<td> 
					<input type="radio"  name="gender"  value="male">男</input> 
					<input type="radio"  name="gender"  value="female">女</input>
				</td>
			</tr>
			<tr>
				<td>年龄</td> <td> <input type="text" name="age"></input></td>
			</tr>
			<tr>
				<td>部门</td> 
				<td> 
					<select name="did">
						<option value="11">SALES</option>
						<option value="22">HR</option>
						<option value="33">RESEARCH</option>
						<option value="44">MANAGE</option>
						<option value="55">ACCOUNT</option>
					</select> 
				</td>
			</tr>
			<tr>
				<td colspan="2">
					<input type="submit" value="确定"></input>   <input type="reset" value="重置"></input>
				</td>
			</tr>
		</table>
		
		
	</form>
</body>
</html>