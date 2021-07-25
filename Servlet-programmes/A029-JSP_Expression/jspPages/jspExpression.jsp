<%@page contentType="text/html;charset=UTF-8"%>

<%--
jsp表达式用法
--%>

<%!
  int i=10;  //声明实例变量
%>

<%  
  out.print(i);  //普通写法
%>

<%--以下时表达式写法，注意“=i”等号必须紧挨住前面的百分号“%”，不可有空格，后面--%>
<%=i %>  