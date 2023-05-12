package com.khaledamin.mawsoaa.service;


import com.khaledamin.mawsoaa.model.models.response.Response;

public interface TopicsService {

    Response findTopicsByCategoryId(long categoryId, String language);

    Response findTopic(String title,String lang);

//    Response findTopics(String title);
}
