package com.polo.app;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

/**
 * 功能描述: todo
 * <p>
 * 作者: Administrator
 * 日期: 2017/12/28 0028 11:39
 */
@Component
public class AccessFilter extends ZuulFilter{
    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run(){
        RequestContext ctx = RequestContext.getCurrentContext();
        try {
            HttpServletRequest request = ctx.getRequest();
            Object accessToken = request.getParameter("accessToken");
            if (accessToken == null){
                ctx.setSendZuulResponse(false);
                ctx.setResponseStatusCode(401);
                return null;
            }
        }catch (Exception ex){
            return null;
        }

        return null;
    }
}
