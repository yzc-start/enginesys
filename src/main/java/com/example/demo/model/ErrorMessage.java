package com.example.demo.model;

public class ErrorMessage {
    private Integer code;
    private String errorMsg;
    private Boolean success;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    @Override
    public String toString() {
        return "ErrorMessage{" +
                "code=" + code +
                ", errorMsg='" + errorMsg + '\'' +
                ", success=" + success +
                '}';
    }
}
