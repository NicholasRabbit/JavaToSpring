<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>   <!-- c:forEach使用时要声明此语句 -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>员工列表</title>
  <link  rel="stylesheet" type="text/css"  href="${pageContext.servletContext.contextPath }/css/index_like.css">   <!-- 引入外部CSS文件，修饰页面 -->
</head>
<body>
	<!-- jsp的EL表达式测试，直接写从EmpController.java中传过来的Map集合内的元素键名就行，也不用使用HttpServletRequest的setAttribute(..)方法。使用很方便。 -->
	<%-- ${empList}   --%>
	<table>
		<tr>
			<th colspan="6">员工列表</th>
		</tr>
		<tr>
			<th>员工编号</th> <th>姓名</th> <th>性别</th> <th>年龄</th> <th>部门</th> <th>编辑(<a href="/SSMTest001/jsp/add.jsp">添加</a>)</th>   <!-- 超链接静态页面别忘加后缀，add.jsp -->
		</tr>
		<c:forEach items="${empList}"  var="emp">  <!-- 和foreach用法类似，这里forEach，E大写 -->
			<tr>
				<td>${emp.id }</td>
				<td>${emp.ename}</td>
				<td>${emp.gender}</td>
				<td>${emp.age }</td>
				<td>${emp.did }</td>
				<td>
				<a href="delete/${emp.id}">删除</a> &nbsp; 
				<a href="update/${emp.id }">修改</a>  &nbsp;
				<a href="emp?id=${emp.id }">详情</a>   <!-- 复习uri普通传数据的写法：……/uri?id=1001&name=Tom -->
				</td>
			</tr>
		</c:forEach>	
			
	</table>
</body>
</html>