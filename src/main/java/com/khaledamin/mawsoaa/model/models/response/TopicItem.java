package com.khaledamin.mawsoaa.model.models.response;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TopicItem {
    private Long id;
    private String Title;
    private String description;
    private String details;
    private String image;
    private String smallImage;
    private String mapImage;
    private String titleImage;
    @JsonIgnore
    private Long categoryId;

}
