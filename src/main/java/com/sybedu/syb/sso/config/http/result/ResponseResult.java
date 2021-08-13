package com.sybedu.syb.sso.config.http.result;

/**
 * @author Rexxar
 * @date 2021/8/11
 */

import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

/**
 * 用于传递restful的json数据
 * @author oldgun
 * @param <T>
 */
@Schema(name = "同一数据返回json格式")
public class ResponseResult<T> implements Serializable {

  public static final String SUCCESS_MESSAGE = "Success!";

  public static final String FAILURE_MESSAGE = "Failure!";



  public ResponseResult(){

  }
  public ResponseResult(Integer code, String msg, T data) {
    setMsg(msg);
    setCode(code);
    setData(data);
  }

  public ResponseResult(Integer code,T data) {
    if(code==0){
      setMsg(SUCCESS_MESSAGE);
    }else {
      setMsg(FAILURE_MESSAGE);
    }
    setCode(code);
    setData(data);
  }
  public ResponseResult(T data) {
    if (data != null) {
      setMsg(SUCCESS_MESSAGE);
      setCode(0);
      setData(data);
    } else {
      setMsg(FAILURE_MESSAGE);
      setCode(1);
      setData(null);
    }
  }

  public ResponseResult(Integer code){
    if(code==0){
      setMsg(SUCCESS_MESSAGE);
      setCode(0);
    }else {
      setMsg(FAILURE_MESSAGE);
      setCode(1);
    }
  }
  /**
   * Getter for property 'code'.
   *
   * @return Value for property 'code'.
   */
  public Integer getCode() {
    return code;
  }

  /**
   * Setter for property 'code'.
   *
   * @param code Value to set for property 'code'.
   */
  public void setCode(Integer code) {
    this.code = code;
  }

  /**
   * Getter for property 'msg'.
   *
   * @return Value for property 'msg'.
   */
  public String getMsg() {
    return msg;
  }

  /**
   * Setter for property 'msg'.
   *
   * @param msg Value to set for property 'msg'.
   */
  public void setMsg(String msg) {
    this.msg = msg;
  }

  /**
   * Getter for property 'data'.
   *
   * @return Value for property 'data'.
   */
  public T getData() {
    return data;
  }

  /**
   * Setter for property 'data'.
   *
   * @param data Value to set for property 'data'.
   */
  public void setData(T data) {
    this.data = data;
  }

  /**
   * 错误码
   */
  @Schema(description = "返回状态码")
  private Integer code;

  /**
   * 提示信息
   */
  @Schema(description = "返回提示信息")
  private String msg;

  /**
   * 具体内容
   */
  @Schema(description = "返回的数据")
  private T data;


}

