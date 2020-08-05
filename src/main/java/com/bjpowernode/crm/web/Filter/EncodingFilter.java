package com.bjpowernode.crm.web.Filter;

import javax.servlet.*;
import java.io.IOException;

public class EncodingFilter implements Filter {
    @Override
    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws IOException, ServletException {
        System.out.println("进入到了过滤器");
        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;utf-8");
        resp.setCharacterEncoding("utf-8");
        chain.doFilter(req,resp);

    }
}
