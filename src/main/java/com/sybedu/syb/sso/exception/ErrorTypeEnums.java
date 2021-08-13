package com.sybedu.syb.sso.exception;

/**
 * @author Rexxar
 * @date 2021/8/13
 */
public enum  ErrorTypeEnums {

  SYSTEM_EXCEPTION(0,"系统异常"),
  BUSSINESS_EXCEPTION(1,"业务异常");

  private int type;

  private String name;

  private ErrorTypeEnums(int type, String name) {
    this.type = type;
    this.name = name;
  }

  public int getType(){
    return this.type;
  }

  public String getName(){
    return this.name;
  }


}
