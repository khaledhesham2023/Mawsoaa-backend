package com.khaledamin.mawsoaa.model.models.response;

import org.springframework.http.HttpStatus;

public class FailedResponse extends Response{

    public FailedResponse(String message) {
        super(new BaseResponseBody(false,message),HttpStatus.BAD_REQUEST);
    }
}
