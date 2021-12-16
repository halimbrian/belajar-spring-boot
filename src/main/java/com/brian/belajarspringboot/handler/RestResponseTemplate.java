package com.brian.belajarspringboot.handler;

import java.util.StringJoiner;

/**
 * @author Brian.kristianto
 * @created 15/12/2021 - 10:05 PM
 **/
public class RestResponseTemplate<T> {
    private Boolean status;
    private T data;
    private String message;

    public RestResponseTemplate(Boolean status, T data, String message) {
        this.status = status;
        this.data = data;
        this.message = message;
    }

    public RestResponseTemplate() {
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
