<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>欢迎页面</title>

</head>
<body>

	<a href="/SpringMVCTest005/showList">显示员工列表</a>	 <br><br>  <!-- 项目内部页面通过超链接访问时，如果省略项目名，则路径前不加斜线“/”，例如 jsp/list.jsp -->
	
	<a href="add">添加新员工</a>   <!-- 这个超链接指向toAdd方法，因为需要获得部门数据进行遍历 -->
</body>
</html>