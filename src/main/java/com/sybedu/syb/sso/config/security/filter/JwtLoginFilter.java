package com.sybedu.syb.sso.config.security.filter;

import com.sybedu.syb.sso.config.security.token.JwtLoginToken;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.security.web.authentication.WebAuthenticationDetails;
import org.springframework.stereotype.Component;

/**
 * @author Rexxar
 * @date 2021/8/11
 */
@Component
public class JwtLoginFilter extends UsernamePasswordAuthenticationFilter {

  @Override
  public Authentication attemptAuthentication(HttpServletRequest httpServletRequest,
      HttpServletResponse httpServletResponse) throws AuthenticationException {
    String userName = httpServletRequest.getParameter("userName");
    String password = httpServletRequest.getParameter("password");
    JwtLoginToken jwtLoginToken = new JwtLoginToken(userName,password);
    jwtLoginToken.setDetails(new WebAuthenticationDetails(httpServletRequest));
    Authentication authentication = this.getAuthenticationManager().authenticate(jwtLoginToken);
    return authentication;
  }

}
