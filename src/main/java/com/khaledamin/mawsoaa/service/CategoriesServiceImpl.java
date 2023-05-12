package com.khaledamin.mawsoaa.service;


import com.khaledamin.mawsoaa.entity.CategoriesEntity;
import com.khaledamin.mawsoaa.model.apirequests.GetAllCategoriesRequest;
import com.khaledamin.mawsoaa.model.models.response.CategoryItem;
import com.khaledamin.mawsoaa.model.models.response.Response;
import com.khaledamin.mawsoaa.model.models.response.SuccessResponseWithData;
import com.khaledamin.mawsoaa.repository.CategoriesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CategoriesServiceImpl implements CategoriesService {

    @Autowired
    private CategoriesRepository categoriesRepository;

    @Override
    public Response getAllCategories(GetAllCategoriesRequest request) {
        List<CategoriesEntity> categoriesEntities = categoriesRepository.findAll();
        if (categoriesEntities.isEmpty()) {
            return new SuccessResponseWithData<>("No available Categories", new ArrayList<>());
        } else {
            List<CategoryItem> categoryItems = new ArrayList<>();
            for (CategoriesEntity category : categoriesEntities) {
                CategoryItem categoryItem = new CategoryItem();
                categoryItem.setId(category.getCategoryId());
                categoryItem.setThumbnail(category.getCategoryThumbnail());
                if (request.getLanguageCode().equals("en")) {
                    categoryItem.setTitle(category.getCategoryName());
                } else if (request.getLanguageCode().equals("ar")) {
                    categoryItem.setTitle(category.getCategoryNameAr());
                }
                categoryItems.add(categoryItem);
            }
            return new SuccessResponseWithData<>("Categories retrieved successfully", categoryItems);
        }
    }
}

