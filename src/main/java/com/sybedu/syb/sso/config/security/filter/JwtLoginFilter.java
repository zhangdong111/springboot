package com.sybedu.syb.sso.config.security.filter;

/**
 * @author Rexxar
 * @date 2021/8/11
 */
//@Component
//public class JwtLoginFilter extends UsernamePasswordAuthenticationFilter {
//
//  @Override
//  public Authentication attemptAuthentication(HttpServletRequest httpServletRequest,
//      HttpServletResponse httpServletResponse) throws AuthenticationException {
//    String userName = httpServletRequest.getParameter("userName");
//    String password = httpServletRequest.getParameter("password");
//    JwtLoginToken jwtLoginToken = new JwtLoginToken(userName,password);
//    jwtLoginToken.setDetails(new WebAuthenticationDetails(httpServletRequest));
//    Authentication authentication = this.getAuthenticationManager().authenticate(jwtLoginToken);
//    return authentication;
//  }
//
//}
