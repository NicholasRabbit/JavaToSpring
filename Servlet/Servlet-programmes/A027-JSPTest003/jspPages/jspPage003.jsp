<%@page contentType="text/html;charset=UTF-8"%>

<%--
声明块的练习
声明块中的java语句会被Tomcat服务器翻译到service(..)方法之外，就是实例变量，静态代码块等的位置
实质上，小脚本和声明块结合起来就是一个java程序，这两个里面就是在写java程序
--%>

<%!  //注意和小脚本区分，这里由感叹号“！”

//可以写静态代码块
static{
	System.out.println("静态代码块执行，在类加载时执行");
}

//也可以写实例代码块
{
	System.out.println("实例代码块执行，在类实例化时执行");
}

//声明实例变量
int i;
String name;

//自定义方法方法
public void doSome(){
	i=20;
	name="Jerry";
	System.out.println(i+":"+name);
	System.out.println("doSome()方法执行");
}


%>

<%   //这个时小脚本,service()方法里

doSome();  //调用doSome()方法
%>