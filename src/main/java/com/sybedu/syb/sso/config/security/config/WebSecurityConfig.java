package com.sybedu.syb.sso.config.security.config;

/**
 * @author Rexxar
 * @date 2021/7/27
 */
//@Configuration
//@EnableWebSecurity
//@EnableGlobalMethodSecurity(prePostEnabled = true)
//public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
//    /**
//     * token过滤器.
//     */
//    @Autowired
//    JwtLoginFilter jwtLoginFilter;
//
//    @Bean
//    @Override
//    public AuthenticationManager authenticationManagerBean() throws Exception {
//        return super.authenticationManagerBean();
//    }
//
//    @Override
//    protected void configure(HttpSecurity httpSecurity) throws Exception {
//        httpSecurity
//            .csrf().disable()
//            // 基于token，所以不需要session
//            .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS).and()
//            .authorizeRequests()
//            // 对于获取token的rest api要允许匿名访问
//            .antMatchers("/apis/user/login","/**","/swagger/**").permitAll()
//            // 除上面外的所有请求全部需要鉴权认证
//            .anyRequest().authenticated();
//        httpSecurity
//            .addFilterBefore(jwtLoginFilter, UsernamePasswordAuthenticationFilter.class);
//        // 禁用缓存
//        httpSecurity.headers().cacheControl();
//    }
//
//    /**
//     * 密码生成策略.
//     *
//     * @return
//     */
//    @Bean
//    public PasswordEncoder passwordEncoder() {
//        return new BCryptPasswordEncoder();
//    }
//}