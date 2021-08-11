package com.sybedu.syb.sso.config.security.config;

import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;

/**
 * @author Rexxar
 * @date 2021/8/11
 */
public class JwtAuthenticationProvider implements AuthenticationProvider {

  @Override
  public Authentication authenticate(Authentication authentication) throws AuthenticationException {

    return null;
  }

  @Override
  public boolean supports(Class<?> aClass) {
    return false;
  }
}
