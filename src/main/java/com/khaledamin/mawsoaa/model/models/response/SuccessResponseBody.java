package com.khaledamin.mawsoaa.model.models.response;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;


public class SuccessResponseBody<T> extends BaseResponseBody{

    @Setter
    @Getter
    private T data;

    public SuccessResponseBody(@NonNull boolean status, @NonNull String message, T data) {
        super(status, message);
        this.data = data;
    }
}
