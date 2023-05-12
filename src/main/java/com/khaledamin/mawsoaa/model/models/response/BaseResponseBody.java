package com.khaledamin.mawsoaa.model.models.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;

@Data
@AllArgsConstructor
public class BaseResponseBody {
    @NonNull
    private boolean status;

    @NonNull
    private String message;
}
