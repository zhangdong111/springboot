package com.sybedu.syb.sso.config.mvc;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author oldgun
 */
@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

    @Value("${spring.profiles.allowed-origins}")
    private String[] allowedOrigins;

    @Value("${spring.web.resources.static-locations}")
    private String[] staticLoactions;


    @Override
    public void addCorsMappings(CorsRegistry registry) {

        //设置允许跨域的路径
        registry.addMapping("/**")
                //设置允许跨域请求的域名
                .allowedOrigins(allowedOrigins)
//                .allowedHeaders("Content-Type",
//                        "X-Requested-With",
//                        "accept",
//                        "Origin",
//                        "Access-Control-Request-Method",
//                        "Access-Control-Request-Headers")
//                .exposedHeaders("Access-Control-Allow-Credentials")
                //是否允许证书 不再默认开启
                .allowCredentials(true)
                //设置允许的方法

//                .allowedMethods("*")
                //跨域允许时间
                .maxAge(3600);
    }
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry){
        registry
            .addResourceHandler("/**")
            .addResourceLocations(staticLoactions);
    }
}
