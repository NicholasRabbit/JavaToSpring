<%@page contentType="text/html"  pageEncoding="UTF-8" %>

<html>

<head>
	<title>项目欢迎页面</title>
</head>

<body>
	
	<a href="/SpringMVCTest002/test">只有方法上有注解吗，/test</a>  <br><br>
	
	<a href="/SpringMVCTest002/mvc/test">类上，方法上都有注解，/mvc/test</a>  <br><br>
	
	<a href="/SpringMVCTest002/mvc/testGetPost">超链接请求默认是GET</a>
	
	<!-- input标签type属性默认值是"text" -->
	<hr>
	<font size="4px" color="black">测试method属性的post,get请求</font>  <br>
	<form action="/SpringMVCTest002/mvc/testGetPost"  method="post">  
		<input type="text" name="username"></input> <br>     <!-- 注意加上name属性并赋值，否则无法传送用户所填的数据，uri?username=tom&password=123,处理请求的方法可接受此数据 -->
		<input type="password" name="password"></input> <br>
		<input type="submit" value="确认"></input>  <input type="reset" value="重置"></input>  <br>
	</form>
	
	<hr>
	<font size="4px" color="black">测试params属性</font>  <br>
	<form action="/SpringMVCTest002/mvc/testParams"  method="get">
		<input type="text" name="username"></input> <br>    
		<input type="password" name="password"></input> <br>
		<input type="submit" value="确认"></input>  <input type="reset" value="重置"></input>  <br>
	</form>
	
	<hr>
	<font size="4px" color="black">测试headers属性</font>  <br>
	<a href="/SpringMVCTest002/mvc/testHeaders">testHeaders</a>  <br><br>
	
	<hr>
	<font size="4px" color="black">测试value属性赋值的Ant写法</font>       <br>
	<a href="/SpringMVCTest002/mvc/abcd/testAnt">/*/testAnt</a>      <br>
	<a href="/SpringMVCTest002/mvc/q/testAnt">/?/testAnt</a>         <br>
	<a href="/SpringMVCTest002/mvc/javaweb/servlet/testAnt">/**/testAnt</a>     <br>
	
	<hr>
	<font size="4px" color="black">测试value属性值Rest</font>       <br>
	<a href="/SpringMVCTest002/mvc/testRest/tom/333">testRest</a>      <br>
</body>


</html>