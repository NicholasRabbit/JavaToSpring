package com.javaweb.servlet;

import javax.servlet.Servlet;
import javax.servlet.ServletException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.Cookie;

import java.io.IOException;

/*(1)本例演示在服务器Servlet程序中创建Cookies，并发送给浏览器的方式
  (2)注意，使用IE浏览器时访问本地服务器要用127.0.0.1，用localhost有时会访问失败
  (3)在Servlet中，cookie是以Cookie类的形式存在的，需要使用时创建Cookie对象
  (4)cookie保存位置如下：
     -浏览器缓存中，浏览器关闭，cookie清除
	 -本地硬盘中，下次用户使用即可调用
  (5)cookie作用范围 
     -只在统一浏览器中可以使用上次保存的cookie,换浏览器需要重新输入信息，如登录名密码等
	 -只在本机可用，换电脑也需重新输入信息
  (6)cookie与浏览器地址栏用户输入路径有关，具体见个人笔记或老杜课堂笔记
  (7)监视查看浏览器接收发送cookie的过程，可用httpwatch配合IE浏览器，
     另外只有IE浏览器可查看保存在电脑里的cookie文件内容，别的浏览器都是加密的
  (8)cookie的绑定路径：
     -如本例浏览器发送请求到服务器，服务器Servlet 程序发送cookie对象的<url-pattern>是：/cookieTest/a，那么cookie的绑定路径就是/cookieTest/..
	  以后浏览器向服务器发送cookie,即使后面输入错误/cookieTest/x也不影响，还是会执行发送，只是无法登录，发送不到而已
     -路径可以指定，调用cookie.setPath(..)方法，一旦指定，只有输入指定路径才可获取，别的任何路径都不行，像上面/cookieTest/..父路径对，子路径错就不行了
*/
public class SendCookiesToBrowser extends HttpServlet {
	
	//服务器创建Cookie，并发送到浏览器，调用的是doGet(..)方法，因为超链接发送的是get方法
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException {
	
		Cookie cookie01=new Cookie("userName","Tom");
		Cookie cookie02=new Cookie("password","123");

        //cookie01.setMaxAge(60*30);  //单位是秒，设置cookie在电脑硬盘保存的时间，不调用则浏览器关闭时清除cookie
		//cookie02.setMaxAge(60*30);

		
		cookie01.setPath("/");   //调用serPath(..)方法，参数"/"表示浏览器访问服务器，即webapps下任意路径都可以获得cookie
		cookie02.setPath("/");

		/*设置路径，设置成项目根路径也可以获取cookie
		cookie01.setPath(request.getContextPath());
		cookie02.setPath(request.getContextPath());
		*/
		
		//cookie01.setHttpOnly(false);   //注意，这个方法不用，火狐浏览器也可以获取cookie,
		//cookie02.setHttpOnly(false); 
		
		//注意，IE浏览器即使调用以上所有方法设置，也无法获取cookie,可知此是浏览器本身设置的原因。
        
		/*
		cookie01.setPath(request.getContextPath()+"/abc");  //此方式设置，浏览器输入此路径也无法获取cookie，原因待查
		cookie02.setPath(request.getContextPath()+"/abc");
		*/

		response.addCookie(cookie01);
		response.addCookie(cookie02);

	}
}