package com.project.ssm.util;

import javax.servlet.http.HttpServletRequest;


import com.github.pagehelper.PageInfo;

//拼接页码工具类
public class PageUtil {
	
	public static String getPageInfo(PageInfo pageInfo,HttpServletRequest resquest) {   //使用HttpServeltRequest要导入servlet-api.jar和jsp-api.jar
			
		String path=resquest.getContextPath();  //当做web项目时用此path
		//String path="/ssm";                   //实验时用此path
		StringBuffer buffer=new StringBuffer();

		//拼接首页，即第一页
		buffer.append("<a href='"+path+"/page_helper/1'>首页</a>"+"&nbsp;");  //注意这里拼接的写法，单引号括住的是url地址，而单引号内部用双引号“+xx+”做拼接。
		
		//拼接上一页,首先判断是否有上一页，如果有就拼接上一页的页数int getPrePage();
		if(pageInfo.isHasPreviousPage()) {
			buffer.append("<a href='"+path+"/page_helper/"+pageInfo.getPrePage()+"'>上一页</a>"+"&nbsp;");
		}else {
			buffer.append("上一页"+"&nbsp;");
		}
		
		//拼接页数，即在网页可视范围内，总共有多少页码，例，从1-10，或2-11
		int[] pagesNums=pageInfo.getNavigatepageNums();  //获取总共显示多少页，返回值是数组
		for(int i=0; i<pagesNums.length; i++) {
			if(pagesNums[i] == pageInfo.getPageNum()) {   //条件解释，如果循环页等于pageInfo所代表的当前页面，则设置红色高亮显示，注意拼接的写法。
				buffer.append("<a href='"+path+"/page_helper/"+pagesNums[i]+"'><font color='red'>"+pagesNums[i]+"</font></a>"+"&nbsp;");
			}else {
				//其他非当前页也得显示，只是不用高亮，这行要放到else里面，否则上面if语句用没加break，其页码会输出两次
				buffer.append("<a href='"+path+"/page_helper/"+pagesNums[i]+"'>"+pagesNums[i]+"</a>"+"&nbsp;");
			}
			
		}
		
		//拼接下一页
		if(pageInfo.isHasNextPage()) {
			buffer.append("<a href='"+path+"/page_helper/"+pageInfo.getNextPage()+"'>下一页</a>"+"&nbsp;");
		}else {
			buffer.append("下一页");
		}
		
		
		//拼接尾页
		buffer.append("<a href='"+path+"/page_helper/"+pageInfo.getPages()+"'>"+"尾页"+"</a>");
		return buffer.toString();
	}
}
