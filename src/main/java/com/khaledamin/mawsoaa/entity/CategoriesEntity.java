package com.khaledamin.mawsoaa.entity;

import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "categories",schema = "mawredy_database")
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CategoriesEntity {

    // GenerationType
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "category_id",columnDefinition = "BIGINT")
    private Long categoryId;

    @Column(name = "category_name",columnDefinition = "VARCHAR(255)")
    private String categoryName;

    @Column(name = "category_thumbnail",columnDefinition = "VARCHAR(255)")
    private String categoryThumbnail;

    @Column(name = "category_name_ar",columnDefinition = "VARCHAR(255)")
    private String categoryNameAr;
}
