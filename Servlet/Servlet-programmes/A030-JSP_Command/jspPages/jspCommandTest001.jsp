<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%--
JSP指令范例
一，指令的作用：知道服务器翻译引擎如何翻译jsp页面
二，JSP共有三个指令
	page: 页面指令
	include: 包含指令
	taglib: 标签库指令(后面讲)
三，语法格式，注意百分号有个“@”,属性值是String类型
	<%@指令名  属性名=属性值 属性名=属性值……%>
	例：首行设置jsp文件编码的方式
四，page指令的常用属性：
    contentType		指定响应内容的类型，同时也可以指定响应编码格式（与pageEncoding功能相同），contentType="text/html;charset=UTF-8"
	pageEncoding	设置页面编码格式
	import			组织导入，因为声明块，小脚本块中无法写Java的import,package等语句，所以引入这个指令，表示导入什么类
	session			设置当前session页面可否直接使用session对象
	errorPage		设置错误页面
	isErrorPage		判断是否是错误页面
	isElIgnored		是否忽略EL表达式（后面讲）

--%>

<%@page import="java.util.Date"%>  <%--属性值是String类型，java语句后面不用加分号“；”--%>
<%@page import="java.text.SimpleDateFormat"%>
<%
	Date date=new Date();
	out.print(date);

	SimpleDateFormat sdf=new SimpleDateFormat("yyyy年MM月dd日 hh:mm");
	String nowDate=sdf.format(date);
	out.print(nowDate);
%>



