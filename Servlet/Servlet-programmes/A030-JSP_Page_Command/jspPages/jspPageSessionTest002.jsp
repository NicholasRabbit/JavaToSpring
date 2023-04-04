<%@page contentType="text/html"  pageEncoding="UTF-8"%>

<%--JSP中page指令属性练习二，session,errorPage,isErrorPage--%>

<%--session属性用法；注意属性值都是String类型，要加双引号
	
	(1)session=“true”/“fasle”;
		一，session属性与getSession(boolean create)中的参数相互独立，互不影响，不用非得一致
		二，session属性值为true时，表示服务器系统自带的HttpSession对象session可用，且jsp小脚本块里不用再声明session变量，session这个名字已被服务器使用
			getSession(bolean create)方法还是具有它本身的作用，不矛盾
		三，session属性值为false时，服务器原来自己新建的session不可用，session被屏蔽了，因此session这个变量名没有被占用，可以HttpSession session=..声明
			值为false时，request.getSession(true)参数可以为true,即服务器的session不可用，程序员可以手写通过请求新建一个session对象
        四，默认session=“true”;
--%>

<%--(1)session用法范例--%>
<%@page session="true"%>  
<%--
<%  
	//HttpSession session=request.getSession(true);   
	//上面错误，当属性session为ture时，这里无需声明变量类型，因为session是Tomcat已经声明好了同名的变量，直接拿来用就行

	session=request.getSession();  //正确写法,默认为true

	/*
	或者重新声明不同变量名，把这次原有的session对象内存地址赋给新的变量
	注意:小脚本块中java语句的getSession(boolean create)参数与属性session="boolean"的值是相互独立的
	*/
	HttpSession session_2=request.getSession(false);  

	/*注意，参照jspPageSessionTest003.jsp的代码，
	  session属性值为false时，也可手写重新获取session对象，即:HttpSession  session=request.getSession(true);
	  这时session这个名字没有声明，或者是被屏蔽了，可以用了
	*/
%>
<%="session"+session%>
<%="session_2"+session_2%>  <%--这俩个结果是一样的，因外在一次会话中只有一个session对象，这里只是把服务器的session内存地址赋给了session_2--%>

--%>



