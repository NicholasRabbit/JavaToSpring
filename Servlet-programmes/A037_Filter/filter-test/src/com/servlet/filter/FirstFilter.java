package com.servlet.filter;

import javax.servlet.*;
import java.io.IOException;

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
