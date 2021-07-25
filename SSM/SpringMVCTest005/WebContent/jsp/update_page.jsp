<%@page language="java" contentType="text/html;charset=UTF-8"%>

<%@page import="com.springmvc.crm.bean.Employee"%>
<%@page import="java.util.Collection"%>
<%@page import="com.springmvc.crm.bean.Department"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>      <!-- 使用”c:foreach“标签是加上这行，否则报错 -->

<html>
<head>
	<title>修改员工信息</title>
	<link  rel="stylesheet" type="text/css"  href="<% out.print(pageContext.getServletContext().getContextPath()); %>/css/index_work.css" >
	  
</head>											   
<body>
	
	<% 
	  Employee emp=(Employee)request.getAttribute("emp");
	  Collection<Department>  depts=(Collection<Department>)request.getAttribute("depts");
	  //out.print(emp);    //测试效果用
	%>
	
	
	
	<form action="/SpringMVCTest005/update" method="post">
		<input type="hidden" name="id" value="<%=emp.getId()  %>"></input>          <br>
		<input type="hidden" name="_method"  value="put"></input>
		<table>
		<tr>
			<td colspan="2">修改员工信息</td>
		</tr>
		<tr> 
		    <td>姓名：</td> <td><input type="text" name="name"  value="<%=emp.getName() %>"></input></td>	
		</tr>	
		<tr>
		    <td>性别：</td> 
		    <td>
		        <input type="radio" name="gender" value="1" <%=emp.getGender().equals(1) ? "checked" : "" %>>男</input>   <%--判断要修改信息用户性别，并设置默认选中 --%>
		        <input type="radio" name=gender value="0"  <%=emp.getGender().equals(0) ? "checked" : "" %>>女</input>
		    </td>
		</tr>
		<tr>
			<td>部门：</td> 
			<td>
				<select name="dept.did">
					<% for(Department dept : depts){ %>
					
					<%--此行判断指定用户的部门与下拉列表的部门是否相同 ，若相同则设置默认显示，即selected--%>
					<% String isChecked=emp.getDept().getDid().equals(dept.getDid()) ? "selected" : ""; %>    
					
					<option value="<%=dept.getDid() %>" <%=isChecked  %>><%=dept.getDname()  %></option>
					
					<%} %>
		</select>		
			</td>
		</tr>
		<tr>
			<td colspan="2"><input type="submit" value="提交"> &nbsp; <input type="reset" value="重置" /></td> 
		</tr> 
		  
		</table>
	</form>
</body>
</html>