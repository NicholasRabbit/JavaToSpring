<%@page language="java" contentType="text/html"  pageEncoding="UTF-8" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@page import="com.springmvc.crm.bean.Employee"%>
<%@page import="java.util.ArrayList" %>
<%@page import="java.util.List" %>
<%@page import="java.util.Collection"%>
<html>
<head>
	<title>员工列表</title>
	<!--(1)这里href路径可写死，写成/SpringMVCTest005/css/index_like.css，但不建议 
		(2)建议写成如下小脚本代码块的形式，这样比较灵活，适配性好，这个代码块用到了JSP内置的一个类PageContext，其对象名字为特定的pageContext，不可更改
		(3)老师课堂源码是用到了jsp的EL表达式写法，个人没学，所以先用小脚本快替代
	-->                     
	<link  rel="stylesheet" type="text/css"  href="<% out.print(pageContext.getServletContext().getContextPath()); %>/css/index_like.css">   <!-- 引入外部CSS文件，修饰页面 -->
	
	<%--使用jquery把超链接的请求默认的get改为delete，以下都是固定格式，后期学jquery后在分析其语法含义--%>
	<script type="text/javascript" src="<%=pageContext.getServletContext().getContextPath()  %>/js/jquery-1.8.2.min.js"></script>
	<script type="text/javascript">
		$(function () {
			$(".del").click(function () {     //这里的“del”是超链接<a>标签的class名，
				//submit()将所获得的form元素提交
				if(confirm("确认删除吗？")){
					$("form").attr("action", this.href).submit();   //“form”是下面的form表单标签名
					return false;
				}
				return false;//将超链接的默认行为取消
			});
		});//预加载函数或文档就绪函数
	</script> 													
</head>

<body>
<% 
	//out.print(request.getAttribute("empList") instanceof Collection);  //结果：true
    Collection<Employee> emps=(Collection<Employee>)request.getAttribute("empList"); 
	
%>
	<table>
		<tr>
			<th>员工编号</th> <th>姓名</th> <th>性别</th> <th>部门</th> <th>操作(<a href="add">添加用户</a>)</th>   <!-- 省略项目名时，相对路径前不要加斜线“/”，否则无法访问 -->
		</tr>
		<% 
			for(Employee emp : emps){
		%>		
			<tr>															
				<td><%=emp.getId()  %></td> 
				<td><%=emp.getName()  %></td> 
				<td><%=emp.getGender()  %></td>    <!-- 可用三目表达式转换为汉字的男女显示：(emp.getGender()==1 ? "男" : "女") -->
				<td><%=emp.getDept().getDname()  %></td>
				<td> <a href="update/<%=emp.getId()  %>" >更改</a> /                 <!-- 相对路径写法， 不加项目名，路径前也不加斜线“/”-->  
			    <a class="del" href="delete/<%=emp.getId()  %>">删除</a>
			    </td>                 <!-- 这里使用Rest风格的写法../delete/id，不用在uri后面加问号“？”的形式 -->
			</tr>	                               
		<% } %>
	</table>
	
	<form method="post">
		<input type="hidden" name="_method" value="DELETE"></input>
	</form>
</body>

</html>
