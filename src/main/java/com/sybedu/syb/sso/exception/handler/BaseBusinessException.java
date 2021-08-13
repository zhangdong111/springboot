package com.sybedu.syb.sso.exception.handler;

import com.sybedu.syb.sso.exception.BaseBussinessErrorCodeEnums;

/**
 * @author Rexxar
 * @date 2021/8/13
 */
public class BaseBusinessException extends RuntimeException implements
    IBusinessException {

  private int exceptionCode;

  public BaseBusinessException(BaseBussinessErrorCodeEnums serverExceptionStatusEnums){
    super(serverExceptionStatusEnums.getExceptionMsg());
    this.exceptionCode = serverExceptionStatusEnums.getExceptionCode();
  }


  @Override
  public String getExceptionMsg() {
    return super.getMessage();
  }

  @Override
  public int getExceptionCode() {
    return this.exceptionCode;
  }

  @Override
  public String getExceptionTrace() {
    return super.getStackTrace().toString();
  }
}
