//package com.sybedu.gk211985.wechat.account.config.security.config;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.config.annotation.web.servlet.configuration.EnableWebMvcSecurity;
//import org.springframework.security.core.authority.AuthorityUtils;
//import org.springframework.security.core.authority.mapping.Attributes2GrantedAuthoritiesMapper;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.crypto.factory.PasswordEncoderFactories;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.security.web.access.intercept.FilterSecurityInterceptor;
//import org.springframework.security.web.authentication.rememberme.JdbcTokenRepositoryImpl;
//import org.springframework.security.web.authentication.rememberme.PersistentTokenRepository;
//
//import javax.sql.DataSource;
//
///**
// * @author Rexxar
// * @date 2021/7/27
// */
//@Configuration
//@EnableGlobalMethodSecurity(prePostEnabled=true)
//public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
//
//    @Autowired
//    private UserDetailsService userDetailsService;
//
//    //  认证过滤器
//
//
//    @Bean
//    MyFilterSecurityInterceptor filterSecurityInterceptor() throws Exception {
//        MyFilterSecurityInterceptor myFilterSecurityInterceptor = new MyFilterSecurityInterceptor();
//        myFilterSecurityInterceptor.setAccessDecisionManager(accessDecisionManager());
//        myFilterSecurityInterceptor.setAuthenticationManager(authenticationManagerBean());
//        myFilterSecurityInterceptor.setSecurityMetadataSource(securityMetadataSource());
//        return myFilterSecurityInterceptor;
//    }
//
//    @Bean(name="myAuthenticationManager")
//    @Override
//    public AuthenticationManager authenticationManagerBean() throws Exception {
//        return super.authenticationManagerBean();
//    }
//
//    @Bean
//    MyAccessDecisionManager accessDecisionManager() {
//        return new MyAccessDecisionManager();
//    }
//
//    @Bean
//    MFilterInvocationSecurityMetadataSource securityMetadataSource() {
//        return new MFilterInvocationSecurityMetadataSource();
//    }
//
//    @Override
//    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        auth.userDetailsService(userDetailsService);
//    }
//
//    @Autowired
//    private DataSource dataSource;
//    @Bean
//    public PersistentTokenRepository persistentTokenRepository(){
//        JdbcTokenRepositoryImpl jdbcTokenRepository = new JdbcTokenRepositoryImpl();
//        // 赋值数据源
//        jdbcTokenRepository.setDataSource(dataSource);
//        // 自动创建表,第一次执行会创建，以后要执行就要删除掉!
//        // jdbcTokenRepository.setCreateTableOnStartup(true);
//        return jdbcTokenRepository;
//    }
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//
//        // 开启记住我功能
//        http.rememberMe().tokenRepository(persistentTokenRepository()) .userDetailsService(userDetailsService);
//
//        // 403
//        http.exceptionHandling().accessDeniedPage("/403.html");
//
//        // logout
//        http.logout().logoutUrl("/my_logout").logoutSuccessUrl("/").permitAll();
//
//
//        http.formLogin()
//                .loginPage("/my_login.html")// 登录页
//                .loginProcessingUrl("/loginaa") // 登录处理的url(controller).需要自己实现
//                .defaultSuccessUrl("/home.html") //登录跳转的url
//                // .failureForwardUrl("/login.html") // 失败后跳转的url
//                // .successForwardUrl("/hello") // 登录成功跳转url
//                // .usernameParameter("username") // 登录时的参数:用户名
//                // .passwordParameter("pass") // 登录时的参数:密码
//                .permitAll()
//            .and()
//                .authorizeRequests()
//                // .antMatchers("/users/**", "/").access("@myAuthService.canAccess(request,authentication)")
//                // .antMatchers("/test").hasRole("TEST")
//                // .antMatchers("/admin").hasAnyRole("ADMIN")
//                // .antMatchers("/read").hasAuthority("read")
//                // .antMatchers("/write").hasAnyAuthority("read,write")
//                .anyRequest().authenticated()
//            .and()
//                .csrf().disable();
//
//        http.addFilterBefore(filterSecurityInterceptor(), FilterSecurityInterceptor.class);
//
//    }
//
//    @Bean
//    public PasswordEncoder passwordEncoder() {
//        return PasswordEncoderFactories.createDelegatingPasswordEncoder();
//    }
//}
