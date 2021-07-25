package com.springmvc.redirect;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.springmvc.bean.User;

/*return "redirect:" 重定向代码范例
 * 复习相关Servlet,JSP知识，结合HttpSession跳转到重定向的目标页面并显示带有用户名的欢迎信息
 *
 * */
@Controller
public class RedirectTest {
	
	@RequestMapping(value="/redirect",method=RequestMethod.POST)
	public String redirectTest (HttpServletRequest request,User user) {

		//获取HttpSession对象，并添加用户信息
		HttpSession session=request.getSession();
		session.setAttribute("user01", user);
		System.out.println("redirect execute");
		return "redirect:/jsp/redirect.jsp";    //前面加"redirect:"是表示重定向，不加是转发
	}
}
