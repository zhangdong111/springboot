//package com.sybedu.gk211985.wechat.account.config.filter;
//
//import com.sybedu.gk211985.wechat.account.config.security.filter.SpringSecurityFilterChain;
//import org.springframework.boot.web.servlet.FilterRegistrationBean;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//public class SpringFilterConfig {
//
//    @Bean(name = "authenticationFilterRegistration")
//    public FilterRegistrationBean myAuthenticationFilterRegistration(final SpringSecurityFilterChain filter) {
//        final FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
//        filterRegistrationBean.setFilter(filter);
//        filterRegistrationBean.setEnabled(false);
//        return filterRegistrationBean;
//    }
//
//}
