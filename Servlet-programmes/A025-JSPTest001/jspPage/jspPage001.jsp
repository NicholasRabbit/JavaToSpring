<%--这个符号是JSP文件的注释符号,写在这里的代码不会被编译--%>

<%--(1)以下中文在浏览器页面显示乱码，浏览器传送接收默认是ISO8859-1,且不可更改，需进行设置,统一编码格式
    (2)写在这个JSP文件中的代码，会被Tomcat服务器自动编译并生成Servlet程序，程序保存在:CATALINA_HOME/work/Catalina里面，并响应发送给浏览器，
	   例：[\work\Catalina\localhost\A025-JSPTest001\org\apache\jsp\jsp\jspPage001_jsp.java]
	   因此jsp底层实际还是Servlet程序，只是两者分工不同，jsp仅作页面展示，servlet进行程序执行编译
	(3)服务器内jsp页面中的内容更改后直接保存，用户只需刷新浏览器即可看到更新内容，无需重启服务器部署
	(4)注意，服务器第一次编译jsp文件会稍慢，因为要全部编译成servlet程序，但是以后更改jsp就会很快更新了，这时就只需翻译变更部分
	(5)jsp文件访问方式和html文件访问方式一样
	(6)*.jsp,*.jspx是默认的后缀名，但可以在*/conf/web.xml中更改
	(7)web.xml文件不用写
--%>

<%@page contentType="text/html;charset=UTF-8"%>   <%--照此设置中文不会乱码，其符号含义后面讲--%>
你好，同志。 <br>   
Hello JSP!	<%--英文不会显示乱码--%>

<%--
上面的不带任何标签的文字，都是html语言，会被写进out.print("这里")，并响应给浏览器显示出来
--%>