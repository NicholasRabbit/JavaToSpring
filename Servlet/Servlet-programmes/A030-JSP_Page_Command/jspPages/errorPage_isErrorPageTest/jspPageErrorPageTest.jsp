<%@page contentType="text/html" pageEncoding="UTF-8" session="true"%>

<%--page指令中errorPage和isErrorPage属性用法范例
	(1)errorPage:该指令可指向一个如error.jsp的页面，当后台程序报错时，可转向这个错误页面
	   作用是使得报错页面简洁美观，没必要向用户展示一些异常信息，浏览体验不好
	   errorPage属性实际底层是转发的原理,与request.getRequestDispatcher("error.html")一样
	(2)isErrorPage="true/false"：如果只使用errorPage的话，仅仅是浏览器用户看到了简洁的错误信息，而后台并没有任何提示，
	   因此须在转发到的如errorPage.jsp页面加上isErrorPage属性，并配合jsp内置类excetpion.printStackTrace()使用，打印程序异常错误信息,见范例
	   属性值为true则可以使用内置的exception,为false则不可以，默认为false
	   注意:isErrorPage属性要写在错误提示页面如error.jsp里面
--%>

<%@page errorPage="/jspPages/errorPage_isErrorPageTest/error.jsp"%>   <%--注意路径的书写方式,同项目下的文件以项目根路径为起点，不可省略--%>
<%
	String str=null;
	null.equals("abc");   //这里会抛出空指针异常
%>
