<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>

<!--注意要导入User，虽然本页面UserList.jsp在:project/jspPages/..下面，但是服务器是从WEB-INF下的classes访问根目录的，因此按照下面写法没错-->
<%@page import="com.javaweb.entity.User"%>  

<html>

<h3>UserList</h3> 
<%	//从ShowList.java转发过来，转发是一次请求，因此可从request中获取保存的集合对象
    //注意返回值是Object,需向下转型
	List<User> myList=(List<User>)request.getAttribute("UserInfo"); 
	for(int i=0; i<myList.size(); i++){  //注意ArrayList集合虽然是一个数组,但是遍历的时调用的方法与数组不一样，长度不能调用length属性，必须掉size()方法
		User u=myList.get(i);            //获取元素时也不是用下标[i]，而是get(int index)方法
		System.out.println(u.getId());
	}
%>

<!--下面遍历输出内容到网页-->
<body>
	<table border="1px"  frame="box">
		<tr>
		<th>id</th> <th>name</th> <th>gender</th>  <th>tel</th> <th>addr</th> <th>操作</th>
		</tr>
		
<!--下面html标签写在循环体中间，也跟着一起循环输出-->  
  <%for(User u : myList){ %>
	<tr align="center">
	<td><%=u.getId()%></td> <td><%=u.getName()%></td>   <td><%=u.getGender()%></td>	 <td><%=u.getTel()%></td>  <td><%=u.getAddr()%></td>
	
	<!--重点：
		(1)注意删除，详情等超链接也要写在<td>标签内
		(2)小脚本代码块也可以写在双引号内，不影响，注意和其它字符串链接间不要有空格，会被翻译成html语言，造成地址错误
		(3)重点掌握超链接地址中最后一个URI,即<url-pattern>地址，要和后面值用问号隔开，这个超链接指向的servlet程序就可通过"id"获取"value"。（重点！！！）
		-->
	<td> <a href="<%=request.getContextPath()   %>/deleteUser?id=<%=u.getId() %>">删除</a> </td>
											<!--小脚本块内部后面有空格没事，它是一个整体-->
	<td> <a href="<%=request.getContextPath()%>/" >详情</a> </td>
	<td> <a href="<%=request.getContextPath()%>/updateUser?id=<%=u.getId() %>">修改</a> </td>
	</tr>                                  

  <%}%>
		
		
		

	</table>
</body>

</html>