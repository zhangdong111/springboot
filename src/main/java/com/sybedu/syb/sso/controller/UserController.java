package com.sybedu.syb.sso.controller;


import com.sybedu.syb.sso.config.http.result.ResponseResult;
import com.sybedu.syb.sso.entity.po.UserPo;
import com.sybedu.syb.sso.exception.BaseBussinessErrorCodeEnums;
import com.sybedu.syb.sso.exception.handler.BaseBusinessException;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import javax.validation.constraints.NotNull;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Rexxer
 * @since 2021-08-11
 */
@RestController
@RequestMapping("/apis/auth/user")
public class UserController {


  @Operation(summary = "用户名密码登录")
  @PostMapping(value = "/login-by-username-password")
  @Parameter(name = "username" , description = "用户名" ,example = "zhangsan",required = true)
  @Parameter(name = "password" , description = "密码" ,example = "123456",required = true)
  public ResponseResult<UserPo> loginByUserNameAndPassword(@RequestParam @NotNull String username , @RequestParam @NotNull String password){
    System.err.println("接收到了参数 : username = " + username +",password = " + password);
//    int a = 1/0;
    throw new BaseBusinessException(BaseBussinessErrorCodeEnums.USER_NAME_OR_PASSWORD_UNCORRECT);
//    return new ResponseResult<UserPo>(0,new UserPo());
  }


}

