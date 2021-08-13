package com.sybedu.syb.sso.exception.handler;

/**
 * @author Rexxar
 * @date 2021/8/13
 */
public interface IBusinessException {

  String getExceptionMsg();

  int getExceptionCode();

  String getExceptionTrace();

}
