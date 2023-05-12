package com.khaledamin.mawsoaa.controller;


import com.khaledamin.mawsoaa.model.apirequests.GetAllCategoriesRequest;
import com.khaledamin.mawsoaa.model.models.response.Response;
import com.khaledamin.mawsoaa.service.CategoriesServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/rest/V1")
public class CategoriesController {

    @Autowired
    private CategoriesServiceImpl categoriesService;

    @PostMapping("/getAllCategories")
    public Response getAllCategories(@RequestBody GetAllCategoriesRequest request){
        return categoriesService.getAllCategories(request);
    }
}
