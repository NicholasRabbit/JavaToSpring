//注意：定好包名之后不要乱改，尤其设置好<context: component-scan base-package="..">之后，容易改了包名，忘了改base-packge的值
package com.springframe.mvcJson;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.springframe.mvcJson.bean.User;
import com.springframe.mvcJson.dao.UserDao;

/*SpringMVC框架处理json的四个条件
 *(1)导入框架所需处理json依赖的jackson...jar包
 *(2)在SpringMVC框架本身的xml配置文件中配置标签<mvc:annotation-driven>,即告诉框架要识别并处理json了
 *(3)在处理请求的方法上加上@Responsebody，底层用的是jackson的jar包进行的转换
 *(4)把需要转换为json的数据或对象作为方法的返回值返回
 *
 * */
@Controller
public class SpringMvcJson {
	
	UserDao userDao;
	
	@ResponseBody
	@RequestMapping(value="/json",method=RequestMethod.GET)
	public List<User> testJson() {
		
		userDao=new UserDao();
		userDao.addUser();
		List<User>  myList=userDao.getMyList();
		
		return myList;
	}
}
