package com.sybedu.syb.sso.config.redis;

/**
 * @author EDZ
 */

import org.springframework.context.annotation.Configuration;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

/**
 * session存放redis
 * @author EDZ
 */
@Configuration
@EnableRedisHttpSession
public class RedisSessionConfig {
}
