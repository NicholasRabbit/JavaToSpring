<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>欢迎页面</title>
</head>
<body>
	
	<a href="/SSMTest001/all_emps">显示员工列表</a>  <br>
	
	<a href="/SSMTest001/page_helper/1">测试分页</a>     <!-- 测试分页时，uri要加……/1,即设置默认首页展示，否则无法向请求方法的形参传数据，造成NullPointerException -->

</body>
</html>