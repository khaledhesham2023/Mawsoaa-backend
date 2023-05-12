package com.khaledamin.mawsoaa.model.models.response;

import org.springframework.http.HttpStatus;

public class SuccessResponseWithData<T> extends Response{
    public SuccessResponseWithData(String message, T data) {
        super(new SuccessResponseBody<>(true,message,data), HttpStatus.OK);
    }
}
