package com.sybedu.syb.sso.config.exception;

import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;
import com.sybedu.syb.sso.config.http.result.ResponseResult;
import com.sybedu.syb.sso.exception.ErrorTypeEnums;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author Rexxar
 * @date 2021/8/12
 */
@RestControllerAdvice
@Slf4j
@Order(2)
public class RuntimeExceptionHandler {

  /**
   * 平台异常处理,http,tomcat,java等的内置异常
   * @param e 系统异常
   * @return
   */
  @ExceptionHandler(value = {RuntimeException.class})
  public ResponseResult<String> generalExceptionHandler(HttpServletRequest request ,
      HttpServletResponse response, Exception e){
      int status = response.getStatus();
      HttpStatus httpStatus = HttpStatus.valueOf(status);
      String httpErrorMsg = httpStatus.getReasonPhrase();
      //状态码,2为出现异常
      ResponseResult result = new ResponseResult(2);
      //系统错误的消息
      result.setMsg(ErrorTypeEnums.SYSTEM_EXCEPTION.getName());
      Map<String,Object> map = new HashMap<>();
      map.put("errorCode",status);
      map.put("errorMsg",httpErrorMsg);
      map.put("trace",e.getStackTrace());
      map.put("errorType",ErrorTypeEnums.SYSTEM_EXCEPTION.getType());
      JSONObject jsonObject = JSONUtil.createObj();
      jsonObject.putAll(map);
      result.setData(jsonObject);

      //打印异常
      e.printStackTrace();
      log.error("发生系统异常 : {0}" , e.getMessage());

      return result;
  }

}
