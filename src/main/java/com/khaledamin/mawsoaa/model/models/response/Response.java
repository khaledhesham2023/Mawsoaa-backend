package com.khaledamin.mawsoaa.model.models.response;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class Response extends ResponseEntity<BaseResponseBody> {
    public Response(BaseResponseBody body,HttpStatus status) {
        super(body, status);
    }
}
