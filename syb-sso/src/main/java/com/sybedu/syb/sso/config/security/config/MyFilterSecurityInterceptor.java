//package com.sybedu.gk211985.wechat.account.config.security.config;
//
//import org.springframework.security.access.SecurityMetadataSource;
//import org.springframework.security.access.intercept.AbstractSecurityInterceptor;
//import org.springframework.security.access.intercept.InterceptorStatusToken;
//import org.springframework.security.web.FilterInvocation;
//import org.springframework.security.web.access.intercept.FilterInvocationSecurityMetadataSource;
//
//import javax.servlet.*;
//import java.io.IOException;
//
//public class MyFilterSecurityInterceptor extends AbstractSecurityInterceptor
//        implements Filter {
//    private FilterInvocationSecurityMetadataSource securityMetadataSource;
//
//    @Override
//    public void doFilter(ServletRequest request, ServletResponse response,
//                         FilterChain chain) throws IOException, ServletException {
//        FilterInvocation fi = new FilterInvocation(request, response, chain);
//        invoke(fi);
//    }
//
//    public FilterInvocationSecurityMetadataSource getSecurityMetadataSource() {
//        return this.securityMetadataSource;
//    }
//
//    @Override
//    public Class<? extends Object> getSecureObjectClass() {
//        return FilterInvocation.class;
//    }
//
//    public void invoke(FilterInvocation fi) throws IOException,
//            ServletException {
//        InterceptorStatusToken token = super.beforeInvocation(fi);
//        try {
//            fi.getChain().doFilter(fi.getRequest(), fi.getResponse());
//        } finally {
//            super.afterInvocation(token, null);
//        }
//    }
//
//    @Override
//    public SecurityMetadataSource obtainSecurityMetadataSource() {
//        return this.securityMetadataSource;
//    }
//
//    public void setSecurityMetadataSource(
//            FilterInvocationSecurityMetadataSource newSource) {
//        this.securityMetadataSource = newSource;
//    }
//
//    @Override
//    public void destroy() {
//    }
//
//    @Override
//    public void init(FilterConfig arg0) throws ServletException {
//    }
//
//}