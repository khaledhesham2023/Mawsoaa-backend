package com.khaledamin.mawsoaa.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@Table(name = "topics", schema = "mawredy_database")
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TopicsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "topic_id", columnDefinition = "BIGINT")
    private Long topicId;
    @Column(name = "topic_title", columnDefinition = "VARCHAR(225)")
    @NonNull
    private String topicTitle;
    @Column(name = "topic_title_ar", columnDefinition = "VARCHAR(225)")
    @NonNull
    private String topicTitleAr;
    @Column(name = "topic_description", columnDefinition = "LONGTEXT")
    @NonNull
    private String topicDescription;
    @Column(name = "topic_details", columnDefinition = "LONGTEXT")
    @NonNull
    private String topicDetails;
    @Column(name = "topic_description_ar", columnDefinition = "LONGTEXT")
    @NonNull
    private String topicDescriptionAr;
    @Column(name = "topic_details_ar", columnDefinition = "LONGTEXT")
    @NonNull
    private String topicDetailsAr;
    @Column(name = "topic_image", columnDefinition = "VARCHAR(255)")
    @NonNull
    private String topicImage;
    @Column(name = "topic_small_image", columnDefinition = "VARCHAR(255)")
    @NonNull
    private String topicSmallImage;
    @Column(name = "topic_map_image", columnDefinition = "VARCHAR(255)")
    @NonNull
    private String topicMapImage;
    @Column(name = "topic_title_image", columnDefinition = "VARCHAR(255)")
    @NonNull
    private String topicTitleImage;
    @Column(name = "category_id",columnDefinition = "BIGINT")
    @NonNull
    @JsonIgnore
    private Long categoryId;

}
