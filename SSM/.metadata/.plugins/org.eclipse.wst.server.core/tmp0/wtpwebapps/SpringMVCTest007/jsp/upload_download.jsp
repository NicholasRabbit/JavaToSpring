<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>下载上传文件</title>
</head>
<body>

	<!-- 如果upload_download.jsp不在根目录下，在“项目根目录/jsp”文件夹下那么 相对路径写法“download”就访问不到对应的请求方法，因为路径成了“/SpringMVCTest007/jsp/download”
		因此要写绝对路径访问请求方法
	-->
	<a href="/SpringMVCTest007/download" >下载</a>   <br><br>
	
	<font size="4px" color="red" >上传文件（只用IO流）</font>
	<form action="/SpringMVCTest007/upload" method="post"  enctype="multipart/form-data" >   <!-- 注意这里是 form 和data之间是横线，不是冒号 -->
		图片：<input type="file"  name="uploadFile"></input>      <br>
		描述：<input type="text"  name="description"></input>     <br>
		<input type="submit" value="上传"></input>                <br>
	</form> 
	
	<font size="4px" color="red" >上传文件（用Spring框架的MultipartFile对象）</font>
	<form action="/SpringMVCTest007/uploadNew" method="post"  enctype="multipart/form-data" >   <!-- 注意这里是 form 和data之间是横线，不是冒号 -->
		图片：<input type="file"  name="uploadFile"></input>      <br>
		描述：<input type="text"  name="description"></input>     <br>
		<input type="submit" value="上传"></input>                <br>
	</form> 
</body>
</html>