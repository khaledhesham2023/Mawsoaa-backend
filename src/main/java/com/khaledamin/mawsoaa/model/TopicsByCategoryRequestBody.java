package com.khaledamin.mawsoaa.model;

import lombok.Data;

@Data
public class TopicsByCategoryRequestBody {

    private Long categoryId;

    private String language;
}
