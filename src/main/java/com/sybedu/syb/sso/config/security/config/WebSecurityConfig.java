package com.sybedu.syb.sso.config.security.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

/**
 * @author Rexxar
 * @date 2021/7/27
 */
@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
    /**
     * token过滤器.
     */
    @Autowired
    LindTokenAuthenticationFilter lindTokenAuthenticationFilter;

    @Bean
    @Override
    public AuthenticationManager authenticationManagerBean() throws Exception {
        return super.authenticationManagerBean();
    }

    @Override
    protected void configure(HttpSecurity httpSecurity) throws Exception {
        httpSecurity
            .csrf().disable()
            // 基于token，所以不需要session
            .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS).and()
            .authorizeRequests()
            // 对于获取token的rest api要允许匿名访问
            .antMatchers("/apis/user/login").permitAll()
            // 除上面外的所有请求全部需要鉴权认证
            .anyRequest().authenticated();
        httpSecurity
            .addFilterBefore(lindTokenAuthenticationFilter, UsernamePasswordAuthenticationFilter.class);
        // 禁用缓存
        httpSecurity.headers().cacheControl();
    }

    /**
     * 密码生成策略.
     *
     * @return
     */
    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}