package com.polo.app;


import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * 功能描述: todo
 * <p>
 * 作者: Administrator
 * 日期: 2017/12/27 0027 16:37
 */
@WebFilter(filterName="TestFilter",urlPatterns={"/*"})
public class DefaultFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("这是一个默认过滤器初始化");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("这是一个默认过滤器");
        filterChain.doFilter(servletRequest, servletResponse);
    }

    @Override
    public void destroy() {
        System.out.println("这是一个默认过滤器销毁");
    }
}
