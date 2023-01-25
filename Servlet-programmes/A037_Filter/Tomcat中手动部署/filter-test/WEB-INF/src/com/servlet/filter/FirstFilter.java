package com.servlet.filter;

import javax.servlet.*;
import java.io.IOException;

/*
* Filter过滤器使用范例
* (1)每个访问服务器上的静态资源，或动态的servlet的请求，都会经过Filter
* (2)Filter可设置多个，继承接口Filter，执行完doFilter()方法后，会执行下一个Filter子类内的方法
* 执行顺序按照web.xml里的设置从上到下来。
* (3)Filter的作用：对请求进行过滤，如验证Token，验证密码等等业务，也可根据实际需求自行设置其他功能。
*/
public class FirstFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("first Filter init");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("first filter's doFilter before!");
        filterChain.doFilter(request,response);     //这里调用doFilter(..)方法，标识本过滤器处理完以后，调用下一个处理器SecondFilter.java，下行sout的语句不会执行，
        System.out.println("first filter's doFilter after!");
    }

    @Override
    public void destroy() {

    }
}
