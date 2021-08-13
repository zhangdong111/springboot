package com.sybedu.syb.sso.exception;

/**
 * @author Rexxar
 * @date 2021/8/13
 */
public enum BaseBussinessErrorCodeEnums implements IBussinessErrorCode {

  USER_NAME_UNEXTIS(1000,"用户名不存在"),
  USER_NAME_OR_PASSWORD_UNCORRECT(1001,"用户名或密码不正确");


  private int exceptionCode;

  private String exceptionMsg;

  private String excepitonTrace;

  private BaseBussinessErrorCodeEnums(int exceptionCode, String exceptionMsg) {
    this.exceptionCode = exceptionCode;
    this.exceptionMsg = exceptionMsg;
  }

  @Override
  public int getExceptionCode() {
    return this.exceptionCode;
  }

  @Override
  public String getExceptionMsg() {
    return this.exceptionMsg;
  }

}
