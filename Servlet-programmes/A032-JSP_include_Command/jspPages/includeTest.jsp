<%@page contentType="text/html;charset=UTF-8"%>
<html>

<%--include指令练习--%>
<!--include只有一个属性：file
(1)注意include指令在jsp页面也是按照自上而下执行顺序，如本例结果是：World ! Hello,后输出Hello
(2)执行include指令后，把include指向页面includedPage.jsp和本页面一起编译到了一个java程序里，在编译阶段就完成了,这属于静态联编
(3)由此可知使用include指令后，在一个页面声明变量，另一个页面也可用，注意执行顺序
(4)可以在一个jsp页面中使用多个include

include的用途：

-->
<%-- <%=i %>  //这里执行报错，因为这里是输出，而下句include指令指向的页面includedPage.jsp后面才执行声明变量，顺序错了--%>

<!--另外注意，html的注释最好不要注释jsp的java语句，有时不起作用-->

<%@include file="/jspPages/includedPage.jsp"%>   <!--注意文件要加后缀.jsp否则报错，无法找到文件-->
Hello 

<%=i %>



<!--可以使用多个include指令-->
<%@include file="/jspPages/includePage2.jsp"%>

	
</html>