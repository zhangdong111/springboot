package com.sybedu.syb.sso.controller;


import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Rexxer
 * @since 2021-07-28
 */
@RestController
@RequestMapping("/apis/user")
public class BuUserController {


  @Autowired
  AuthenticationManager authenticationManager;

  @Autowired
  UserDetailsService userDetailsService;

  @GetMapping("/login")
  @Operation(summary = "用户登录")
  @Parameters(
      {
          @Parameter(
          name = "username",
          example = "zhangdong"
          ),
          @Parameter(
              name = "password",
              example = "123456"
          )
      }
  )
  public ResponseEntity<?> refreshAndGetAuthenticationToken(
      @RequestParam String username,
      @RequestParam String password) throws AuthenticationException {
    return ResponseEntity.ok(generateToken(username, password));
  }

  /**
   * 登陆与授权.
   *
   * @param username .
   * @param password .
   * @return
   */
  private String generateToken(String username, String password) {
    UsernamePasswordAuthenticationToken upToken = new UsernamePasswordAuthenticationToken(username, password);
    // Perform the security
    final Authentication authentication = authenticationManager.authenticate(upToken);
    SecurityContextHolder.getContext().setAuthentication(authentication);
    // Reload password post-security so we can generate token
    final UserDetails userDetails = userDetailsService.loadUserByUsername(username);
    // 持久化的redis
//    String token = CommonUtils.encrypt(userDetails.getUsername());
//    redisTemplate.opsForValue().set(token, userDetails.getUsername());
    return userDetails.getUsername();
  }


}

