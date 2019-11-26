package com.itrip.beans.dto;

/**
 * 数据传输对象
 */
public class Dto<T> {
    /**
     * 成功标识：true/false
     */
    private String success;
    /**
     * 错误码（正确：0）
     */
    private String errorCode;
    /**
     * 消息
     */
    private String message;
    /**
     * 封装的数据
     */
    private T data;

    public String getSuccess() {
        return success;
    }

    public void setSuccess(String success) {
        this.success = success;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

}
