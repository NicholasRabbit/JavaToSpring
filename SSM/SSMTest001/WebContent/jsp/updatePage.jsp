<%@page language="java"  contentType="text/html"  pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>   <!-- c:forEach使用时要声明此语句 -->

<%@page import="com.project.ssm.bean.Emp" %>

<html>

<head>
	<title>修改员工信息</title>
</head>

<link rel="stylesheet"  type="text/css" href="${pageContext.servletContext.contextPath}/css/index_work.css">

 
<body>

<%-- ${emp.gender}  
${deptList} --%>

 <!-- 这里输出emp对象，验证出beforeUpdateEmp(..)方法的Map集合对象添加元素时也把元素emp对象放进了请求对象HttpServletRequest里面 -->
<%  Emp emp=(Emp)request.getAttribute("emp");
	out.print(emp);
%>   
 
	<form action="/SSMTest001/update"  method="post">
		<input type="hidden" name="id" value="${emp.id }"></input>     <!-- emp对象的id,did都不用用户填，因为修改用户资料，还是用以前的id,did。 -->
		<input type="hidden" name="did" value="${emp.did }"></input>
		<table>
			<tr>
				<td colspan="2">修改员工信息</td>
			</tr>
			
			<tr>
				<td>用户名</td>  <td> <input type="text"  name="ename"  value="${emp.ename}"></input> </td>
			</tr>
			<tr>
				<td>性别</td>  
				<td>     <!-- 这里性别不是数字，无法用EL三目表达式判断，可用小脚本块三目表达式判断，emp对象上面已经获取 -->
					<input type="radio"  name="gender"  value="male"  <%="male".equals(emp.getGender()) ?  "checked" : "" %>>男</input>   
					<input type="radio"  name="gender"  value="female"   <%="female".equals(emp.getGender()) ?  "checked" : "" %>>女</input>
				</td>
			</tr>
			<tr>
				<td>年龄</td> <td> <input type="text" name="age" value="${emp.age}"></input></td>
			</tr>
			
			<tr>
				<td>部门</td> 
				
					<td> 
						<select name="dept.did">   <!-- 这里给Emp对象中的dept属性的did传值 -->
								<c:forEach items="${deptList}"  var="dept">
									<option value="${dept.did}" ${dept.did==emp.dept.did ? 'selected' : '' }>${dept.dname}</option>
								</c:forEach>					<!--把员工原来部门默认选中，使用 EL表达式的三目运算的写法，注意双等号“==”只能比较数字 -->
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