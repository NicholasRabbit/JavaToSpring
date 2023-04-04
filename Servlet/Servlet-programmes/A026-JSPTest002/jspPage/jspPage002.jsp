<%--
JSP中标签小脚本练习
<%%>小脚本scriptlet符号
--%>

<%@page contentType="text/html;charset=UTF-8"%>   <%--注意要设置编码，否则中文无法编译，会乱码--%>

<%  
	/*这里注释也按照java的规定
	(1)写到小脚本这里的都是放到servlet程序的service(..)方法中执行的java代码；
	(2)这里的语法规则符号用法，完全按照java的规定要求,都要加分号";"
	(3)小脚本可以编写多个，遵循自上而下执行原则
	(4)service(..)方法中不能声明实例变量，只能由局部变量等等，要注意
	*/
	String name="Tom";
	System.out.println(name);  

	String sentence="小脚本内out.print输出";
	out.print(sentence);

%>

<br><br>
小脚本外面的都是html语言
<br><br>

<%


//第二个小脚本
/*
以前把Servlet中service(ServletRequest req, ServletResponse res)方法中的req,res改为request,response的原因？
是为了与现在的Tomcat自动生成Servlet中的参数默认名称一致，便于记忆和管理
*/
out.print(request);    
out.print(response);  

%>