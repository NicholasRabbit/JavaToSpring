<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@page session="false"%>

<%  //因为一个jsp页面无法为属性session赋值两次，无法在一起对比测试，因此写在这里
	//注意当session为false时，个人可手写获取新的session对象，不用服务器的session，不矛盾
	HttpSession session=request.getSession(true);
	//out.write(session);   //注意使用out.write(..)方法时，参数不能是对象，write(..)方法继承父类Writer，此方法重载时没有对象类参数
%>
