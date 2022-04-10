<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>员工详情</title>
  <link  rel="stylesheet" type="text/css"  href="${pageContext.servletContext.contextPath }/css/index_like.css">   <!-- 引入外部CSS文件，修饰页面 -->
</head>
<body>
	<table>
		<tr>
			<th colspan="7">员工详情(<a href="/SSMTest001/all_emps">总表</a> )</th>
		</tr>
		<tr>
			<th>员工编号</th> <th>姓名</th> <th>性别</th> <th>年龄</th> <th>部门编号</th> <th>部门名称</th> <th>编辑(<a href="/SSMTest001/jsp/add.jsp">添加</a>)</th>   <!-- 超链接静态页面别忘加后缀，add.jsp -->
		</tr>
		
			<tr>
				<td>${emp.id }</td>       <!-- 这里的emp是ModelAndView对象中的键key，不是value:emp01，即mav.addObject("emp", emp01) -->
				<td>${emp.ename}</td>
				<td>${emp.gender}</td>
				<td>${emp.age }</td>
				<td>${emp.did }</td>
				<td>${emp.dept.dname }</td>
				<td>
				<a href="delete/${emp.id}">删除</a> &nbsp; 
				<a href="update/${emp.id }">修改</a>  &nbsp;
				</td>
			</tr>
		
			
	</table>
</body>
</html>