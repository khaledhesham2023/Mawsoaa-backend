package com.khaledamin.mawsoaa.model.apirequests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllCategoriesRequest {

    @NonNull
    private String languageCode;

}
