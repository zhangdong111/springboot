package com.sybedu.syb.sso.config.http.config;

import org.apache.catalina.Context;
import org.apache.catalina.connector.Connector;
import org.apache.tomcat.util.descriptor.web.SecurityCollection;
import org.apache.tomcat.util.descriptor.web.SecurityConstraint;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Rexxar
 * @Date 2021/7/20
 */
@Configuration
public class HttpConfigration {

  @Value("${server.port}")
  Integer https_port;

  @Value("${server.http-port}")
  Integer http_port;

  /**
   * spring boot 2.0
   * @return TomcatServletWebServerFactory容器
   */
  @Bean
  public TomcatServletWebServerFactory servletContainer() {
    TomcatServletWebServerFactory tomcat = new TomcatServletWebServerFactory() {
      @Override
      protected void postProcessContext(Context context) {
        SecurityConstraint constraint = new SecurityConstraint();
        constraint.setUserConstraint("CONFIDENTIAL");
        SecurityCollection collection = new SecurityCollection();
        collection.addPattern("/*");
        constraint.addCollection(collection);
        context.addConstraint(constraint);
      }
    };
    tomcat.addAdditionalTomcatConnectors(httpConnector());
    return tomcat;
  }

  /**
   * 得到http连接
   * @return http连接
   */
  @Bean
  public Connector httpConnector() {
    Connector connector = new Connector("org.apache.coyote.http11.Http11NioProtocol");
    connector.setScheme("http");
    //Connector监听的http的端口号
    connector.setPort(http_port);
    connector.setSecure(true);
    //监听到http的端口号后转向到的https的端口号
    connector.setRedirectPort(https_port);
    return connector;
  }

}
