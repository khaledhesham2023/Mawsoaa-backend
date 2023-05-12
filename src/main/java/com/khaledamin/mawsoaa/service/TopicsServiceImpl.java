package com.khaledamin.mawsoaa.service;


import com.khaledamin.mawsoaa.entity.TopicsEntity;
import com.khaledamin.mawsoaa.model.models.response.FailedResponse;
import com.khaledamin.mawsoaa.model.models.response.Response;
import com.khaledamin.mawsoaa.model.models.response.SuccessResponseWithData;
import com.khaledamin.mawsoaa.model.models.response.TopicItem;
import com.khaledamin.mawsoaa.repository.TopicsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TopicsServiceImpl implements TopicsService {

    @Autowired
    private TopicsRepository topicsRepository;

    @Override
    public Response findTopicsByCategoryId(long categoryId, String language) {
        List<TopicsEntity> topicsEntities = topicsRepository.findByCategoryId(categoryId);
        if (topicsEntities == null) {
            return new FailedResponse("Error during fetching the topics");
        } else if (topicsEntities.isEmpty()) {
            return new SuccessResponseWithData<>("Topics retrieved successfully", new ArrayList<>());
        } else {
            List<TopicItem> topicItems = new ArrayList<>();
            for(TopicsEntity topicsEntity : topicsEntities) {
                TopicItem topicItem = new TopicItem();
                topicItem.setCategoryId(topicsEntity.getCategoryId());
                topicItem.setId(topicsEntity.getTopicId());
                topicItem.setImage(topicsEntity.getTopicImage());
                topicItem.setMapImage(topicsEntity.getTopicMapImage());
                topicItem.setTitleImage(topicsEntity.getTopicTitleImage());
                topicItem.setSmallImage(topicsEntity.getTopicSmallImage());
                if (language.equals("en")) {
                    topicItem.setTitle(topicsEntity.getTopicTitle());
                    topicItem.setDetails(topicsEntity.getTopicDetails());
                    topicItem.setDescription(topicsEntity.getTopicDescription());
                } else if (language.equals("ar")) {
                    topicItem.setTitle(topicsEntity.getTopicTitleAr());
                    topicItem.setDetails(topicsEntity.getTopicDetailsAr());
                    topicItem.setDescription(topicsEntity.getTopicDescriptionAr());

                }
                topicItems.add(topicItem);
            }
                    return new SuccessResponseWithData<>("Topics retrieved successfully", topicItems);
            }
        }




    @Override
    public Response findTopic(String title, String lang) {
        List<TopicsEntity> topics = new ArrayList<>();
        switch (lang) {
            case "ar" -> {
                topics = topicsRepository.findByTopicTitleArContainingIgnoreCase(title);
            }
            case "en" -> {
                topics = topicsRepository.findByTopicTitleContainingIgnoreCase(title);
            }
        }

        if (topics == null) {
            return new FailedResponse("Error during fetching the topics");
        } else if (topics.isEmpty()) {
            return new SuccessResponseWithData<>("Topics retrieved successfully", new ArrayList<>());
        } else {
            List<TopicItem> topicItems = new ArrayList<>();
            for (TopicsEntity topic : topics){
                TopicItem topicItem = new TopicItem();
                topicItem.setSmallImage(topic.getTopicSmallImage());
                topicItem.setImage(topic.getTopicImage());
                topicItem.setId(topic.getTopicId());
                topicItem.setCategoryId(topic.getCategoryId());
                topicItem.setTitleImage(topic.getTopicTitleImage());
                topicItem.setMapImage(topic.getTopicMapImage());
                if (lang.equals("en")){
                    topicItem.setTitle(topic.getTopicTitle());
                    topicItem.setDescription(topic.getTopicDescription());
                    topicItem.setDetails(topic.getTopicDetails());
                } else {
                    topicItem.setTitle(topic.getTopicTitleAr());
                    topicItem.setDescription(topic.getTopicDescriptionAr());
                    topicItem.setDetails(topic.getTopicDetailsAr());
                }
                topicItems.add(topicItem);
            }
            return new SuccessResponseWithData<>("Topics retrieved successfully", topicItems);
        }
    }

//    @Override
//    public Response findTopics(String title) {
//        List<TopicsEntity> topics = topicsRepository.findByTopicTitleArContainingIgnoreCase(title);
//
//        if (topics == null) {
//            return new FailedResponse("Error during fetching the topics");
//        } else if (topics.isEmpty()) {
//            return new SuccessResponseWithData<>("Topics retrieved successfully", new ArrayList<>());
//        } else {
//            return new SuccessResponseWithData<>("Topics retrieved successfully", topics);
//        }
//    }
}
