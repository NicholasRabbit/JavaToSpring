package com.servlet.filter;

import javax.servlet.*;
import java.io.IOException;

public class SecondFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("second filter init execute!");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("second filter doFilter before!");
        filterChain.doFilter(request,response);  //这个doFilter(..)方法执行完会执行servlet里的方法，然后才会执行下面的sout after语句，然后再返回FirstFilter.java执行其内的sout after语句
        System.out.println("second filter doFilter after!");
    }

    @Override
    public void destroy() {

    }
}
