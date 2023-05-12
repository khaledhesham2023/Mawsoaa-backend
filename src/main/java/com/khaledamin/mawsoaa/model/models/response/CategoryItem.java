package com.khaledamin.mawsoaa.model.models.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CategoryItem {

    private Long id;

    private String title;

    private String thumbnail;
}
