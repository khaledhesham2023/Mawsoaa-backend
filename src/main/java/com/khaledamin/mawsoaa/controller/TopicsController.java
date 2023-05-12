package com.khaledamin.mawsoaa.controller;


import com.khaledamin.mawsoaa.model.FindTopicRequest;
import com.khaledamin.mawsoaa.model.TopicsByCategoryRequestBody;
import com.khaledamin.mawsoaa.model.models.response.Response;
import com.khaledamin.mawsoaa.service.TopicsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/rest/V1")
public class TopicsController {

    @Autowired
    private TopicsServiceImpl topicsService;

    @PostMapping("/getTopicsByCategoryId")
    public Response getTopicsByCategoryId(@RequestBody TopicsByCategoryRequestBody body){
        return topicsService.findTopicsByCategoryId(body.getCategoryId(),body.getLanguage());
    }

    @PostMapping("/findTopic")
    public Response findTopicByName(@RequestBody FindTopicRequest topic){
        return topicsService.findTopic(topic.getTitle(),topic.getLang());
    }
}
