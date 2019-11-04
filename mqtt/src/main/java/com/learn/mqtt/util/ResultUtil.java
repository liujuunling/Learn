package com.learn.mqtt.util;

import java.util.Map;

public class ResultUtil {


    protected static final  Integer FAIL_CODE = 1;
    protected static final  Integer SUCCESS_CODE = 1;


    //响应码
    protected Integer code;
    //响应信息
    protected String message;
    //响应数据
    protected Object data;


    public ResultUtil() {
        super();
    }

    public ResultUtil(Integer code, String message, Object data) {
        super();
        this.code = code;
        this.message = message;
        this.data = data;
    }


    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }



    @Override
    public String toString() {
        return "ResultUtil{" +
                "code=" + code +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }



}
