<%@page contentType="text/html"  pageEncoding="UTF-8"%>
<html>
<head>
	<title>get,post请求方式，以及用post发送六个请求的方法</title>	
</head>
<body>
	<font size="4px" color="black">get请求，常用于查询</font>
	<form action="/SpringMVCTest003/testGet"  method="get">
		用户名：<input type="text" name="username"></input>       <br>
		密码：<input type="password" name="password"></input>	  <br>
		<input type="submit" value="确认(get)"></input>  &nbsp; <input type="reset" value="重置"></input>  <br> 
	</form>
	
	<font size="4px" color="black">post请求，常用于增加用户</font>
	<form action="/SpringMVCTest003/testPost"  method="post">
		用户名：<input type="text" name="username"></input>       <br>
		密码：<input type="password" name="password"></input>	  <br>
		<input type="submit" value="确认(post)"></input>  &nbsp; <input type="reset" value="重置"></input>  <br> 
	</form>
	
	<font size="4px" color="black">put请求，常用于修改用户信息</font>
	<form action="/SpringMVCTest003/testPut"  method="post">
	    <!-- put,delete请求，这里必须method="post"不可用“get”,实际时再后台Spring的过滤器把“_method”的value的“put”替换掉了post,即改为了put -->     
		<input type="hidden" name="_method" value="put"></input>   
		用户名：<input type="text" name="username"></input>       <br>
		密码：<input type="password" name="password"></input>	  <br>
		<input type="submit" value="确认(put)"></input>  &nbsp; <input type="reset" value="重置"></input>  <br> 
	</form>
	
	<font size="4px" color="black">delete请求，常用于删除用户信息</font>
	<form action="/SpringMVCTest003/testDelete"  method="post">
		<input type="hidden" name="_method" value="delete"></input>   
		用户名：<input type="text" name="username"></input>       <br>
		密码：<input type="password" name="password"></input>	  <br>
		<input type="submit" value="确认(delete)"></input>  &nbsp; <input type="reset" value="重置"></input>  <br> 
	</form>
	
	
	<font size="4px" color="black">正常写法与Rest风格写法对比，其中id是隐藏 的</font>
	<form action="/SpringMVCTest003/testRest"  method="post">        <!-- 正常url写法提交请求后是../testDelete?id=1001 -->
		<input type="hidden" name="_method" value="delete"></input>   
		<input type="hidden" name="id" value="1001"/>  				 
		用户名<input type="text" name="username"/>                      <br>
		<input type="submit" value="确认"></input>  &nbsp; <input type="reset" value="重置"></input>  <br> 
	</form>
	
	<font size="4px" color="black">Rest风格写法，uri写法不同</font>
	<form action="/SpringMVCTest003/testRest/1001"  method="post">   
		<input type="hidden" name="_method" value="delete"></input>   
		<input type="hidden" name="id" />  				 
		用户名<input type="text" name="username"/>                      <br>
		<input type="submit" value="确认"></input>  &nbsp; <input type="reset" value="重置"></input>  <br> 
	</form>
	
	
	
</body>
</html>