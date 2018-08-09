package com.itapril.sample.api.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

/**
 * @author itapril.
 * @create 2018/8/9 09:30.
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class ResultResponse implements Serializable {
    private String message;
    private String errorCode = "0";
    private Boolean status;
    private Object result;

    public ResultResponse() {
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Boolean getStatus() {
        return this.status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Object getResult() {
        return this.result;
    }

    public void setResult(Object result) {
        this.result = result;
    }

    public void setSuccess(String message) {
        this.setMessage(message);
        this.setStatus(true);
    }

    public String getErrorCode() {
        return this.errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public void setSuccess(String message, Object resul) {
        this.setMessage(message);
        this.setResult(resul);
        this.setStatus(true);
    }

    public void setError(String message) {
        this.setMessage(message);
        this.setStatus(false);
    }

    public void setError(String message, String errorCode) {
        this.setMessage(message);
        this.setErrorCode(errorCode);
        this.setStatus(false);
    }
}