<%@page import="java.util.Collection"%>
<%@page import="com.springmvc.crm.bean.Department"%>
<%@page language="java" contentType="text/html;charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>      <!-- 使用”c:foreach“标签是加上这行，否则报错 -->

<html>
<head>
	<title>增加新员工</title>
	<link  rel="stylesheet" type="text/css"  href="<% out.print(pageContext.getServletContext().getContextPath()); %>/css/index_work.css" >
	  
</head>											   
<body>
	
	<% 
	  Collection<Department> depts=(Collection<Department>)request.getAttribute("depts");
	  
	//把集合内元素放数组里，用new Department[0]初始长度为0的数组作为实参，toArray(..)方法会自动扩容
	  Department[] deptArray=depts.toArray(new  Department[0]);     //集合类的toArray(Obejct[] a)有参用法，把集合中元素放到一个数组里，注意调用方法括号要放实参，不是形参（java基础知识，忘了？）
	%>
	
	
	<form action="/SpringMVCTest005/add" method="post">
		<input type="hidden" name="id"></input>          <br>
		<table>
		<tr>
			<td colspan="2">增加员工</td>
		</tr>
		<tr> 
		    <td>姓名：</td> <td><input type="text" name="name"></input></td>	
		</tr>	
		<tr>
		    <td>性别：</td> 
		    <td>
		        <input type="radio" name="gender" value="1">男</input>  
		        <input type="radio" name=gender value="0" checked>女</input>
		    </td>
		</tr>
		<tr>
			<td>部门：</td> 
			<td>
				<select name="dept.did">
				<!-- <option  value="00">部门名称</option>    这里是写死的，扩展性不好 -->
				<% for(int i=0;i<deptArray.length;i++){ %>
				<option  value="<%=deptArray[i].getDid() %>"><%=deptArray[i].getDname()  %></option>
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