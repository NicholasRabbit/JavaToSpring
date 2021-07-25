package com.javaweb.http;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import javax.servlet.ServletException;

import java.io.IOException;
import java.io.PrintWriter;

/*(1)一次会话对应一个session对象，一次会话就是打开一次浏览器到关闭这个过程
  (2)Http这几个类的范围：ServeltContext(应用级别的) > HttpSession(会话级别的) > HttpServletRequest(请求级别的)	
  (3)在一次会话中，服务器会为每个Session对象创建一个cookie对象，这个cookie对象的名字name是JsessionID,对应value是一个32位的字符串
     同一次会话中，每次刷新或请求都会发送这个cookie对象，在后端的session列表中找到对应的session对象，所以每次刷新都是显示同一个session对象的内存地址
	 浏览器关闭(会话结束了)则cookie,session对象会按照系统设定时间内自动清除，默认是30分钟
	 也可在web.xml文件中手动设置session保存时间，例：
	 <session-config>
		<session-timeout>120</session-timeout>  //单位值分钟
	 </session-config>
  (4)如果用户关闭浏览器，后端服务器是不知道用户关闭的，所以session对象保留一段时间，例如手机银行直接退出和点安全退出的区别，点安全退出则后端知道退出这件事了，就会销毁session
     想要手动设置销毁session对象，则需调用void invilidate()方法
  (5)如果浏览器禁用cookie或者自己手动关闭了浏览器,如何找到上次会话中的session对象？
     在浏览器地址栏手动输入JsessionID,
	 例：http://127.0.0.1:8080/A024-A024-HttpSessionTest/test/session;jsessionid=D3E9985BC5FD4BD05018BF2966863E94
  (6)HttpSession常用方法练习  
*/
public class HttpSessionTest001 extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		/*(1)getSession()方法是子类特有，父类ServeltRequest没有，要注意
		  (2)getSession(),geSession(boolean create)方法重载，
		     HttpSession getSession():无参，如果原先有就获取，没有则新建
			 HttpSession getSession(true):如果原先有就获取，没有则新建
			 HttpSession getSession(false):如果原先有就获取，没有返回null,不新建
		*/
		
		HttpSession session=request.getSession();
					session=request.getSession(true);   
		System.out.println("session: "+session);      //结果：session: org.apache.catalina.session.StandardSessionFacade@181367cc
		
		session.invalidate();  //手动销毁session对象,优先级高于web.xml文件中设置的时间
		

		//下面这个方法如果原来没有session,则返回null，不会新建
		HttpSession session_B=request.getSession(false);
		System.out.println("session_B: "+session_B);   //null

	}
}