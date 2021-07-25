<%@page contentType="text/html;charset=UTF-8"%>

<%--JSP中include动作(动态联编)练习，注意不是include指令(静态联编)，注意区分
	(1)jsp:include动作指向B.jsp页面后，服务器生成的是两个java程序，原理是A.java中的service()方法调用了B.java中的service()方法
	(2)静态联编动态联编区别
	如果只声明一个变量，例如,int i 想要A.jsp和B.jsp两个页面共享的话，需使用静态联编，即使用include指令
	如果A.jsp和B.jsp中有两个同名的变量，使用静态联编会冲突，要使用动态联编，即使用jsp:include动作，底层会生成两个java程序
--%>

<jsp:include page="/jspPages/jsp_include_B.jsp"></jsp:include>