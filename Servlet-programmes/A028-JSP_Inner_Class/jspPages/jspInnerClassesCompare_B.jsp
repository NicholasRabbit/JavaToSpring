<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%--从A转发到这里--%>

<%=pageContext.getAttribute("pageContextKey") %>  <%--测试jsp能否跨页面--%>
<%--如果转发到这里，是一次请求，但是是不同的jsp页面，因此jsp页面范围的pageContext里的内容读不到A中设置的属性值--%>
<br>
<%=request.getAttribute("requestKey")%>      
<!--先访问A.jsp,然后会转发到这里
	(1)不关闭浏览器的情况下，如果是转发则可以读到A中存的属性值，
			null
			requestValue
			sessionValue
			contextKey
	(2)但是地址栏直接输入:"/jspPages/jspInnerClassesCompare_B.jsp",则是单独请求B,与A无关，无法读取A中设置的属性值
	        null
			null
			sessionValue
			contextKey
-->
<br>
<%=session.getAttribute("sessionKey")%>
<!--关闭浏览器，重新打开，地址栏直接输入/jspPages/jspInnerClassesCompare_B.jsp，就访问不到A.jsp中的session对象属性值了
	但是application这个应用级别的对象属性值可以访问A.jsp中设定好的
-->
<br>
<%=application.getAttribute("contextKey")%> 
<!--重启服务器后，直接打开B.jsp就无法获取A.jsp中设置的属性了-->
<br>
<br>
