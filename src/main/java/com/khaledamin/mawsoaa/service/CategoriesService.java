package com.khaledamin.mawsoaa.service;


import com.khaledamin.mawsoaa.model.apirequests.GetAllCategoriesRequest;
import com.khaledamin.mawsoaa.model.models.response.Response;

public interface CategoriesService {

    Response getAllCategories(GetAllCategoriesRequest request);
}
