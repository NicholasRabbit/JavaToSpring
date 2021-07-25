<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

<%
//浏览器显示内容时，这里使用out.println()无法自动换行,out.print("\r\n")也无法换行,out.write("\r\n")也不可以换行
//原因out.println,out.print("\r\n")和out.write("\r\n")的换行作用是体现在html源代码里面，而不是浏览器显示出来
//这是属于jsp转换为html，而换行是html转换为页面效果
	
	out.write("Hello");
	out.write("\r\n");    //在浏览器页面显示不出换行效果，只是在html源代码换行了
	out.write("Again");
	
	//out.write(session);  //注意使用out.write(..)方法时，参数不能是对象，write(..)方法继承父类Writer，此方法重载时没有对象类参数

	out.println("你好");  //这里也同样道理
	out.println("月球");

	out.print("Tom");
	out.print("\r\n");   //这里也同样道理
	out.print("Jerry");
%>

<%--(1)第一种写法可以浏览器页面换行--%>
<br>
<%
	out.print("浮云蔽白日；");
%>
<br>
<%
	out.print("游子不顾返。");
%>
<br>

<%--(2)第二种写法，浏览器页面换行--%>
<%
	out.print("Welcome");
	out.print("<br>");
	out.print("back!");
%>
