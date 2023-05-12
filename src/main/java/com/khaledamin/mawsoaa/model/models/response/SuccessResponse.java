package com.khaledamin.mawsoaa.model.models.response;

import org.springframework.http.HttpStatus;

public class SuccessResponse extends Response{

    public SuccessResponse(String message) {
        super(new BaseResponseBody(true,message),HttpStatus.OK);
    }
}
