package com.sybedu.syb.sso;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;
import org.springframework.transaction.annotation.EnableTransactionManagement;
@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
@EnableCaching
@EnableTransactionManagement
@EnableRedisHttpSession
@EnableAsync
@EnableFeignClients
@EnableAspectJAutoProxy(exposeProxy = true)
public class Gk211985WechatAccountApplication {

    public static void main(String[] args) {
        SpringApplication.run(Gk211985WechatAccountApplication.class, args);
    }

}
