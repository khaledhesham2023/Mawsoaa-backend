package com.khaledamin.mawredy.repository;

import com.khaledamin.mawsoaa.entity.CategoriesEntity;
import com.khaledamin.mawsoaa.repository.CategoriesRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class CategoriesRepositoryTest {

    @Autowired
    private CategoriesRepository categoriesRepository;


    @Test
    public void saveCategory(){
        CategoriesEntity categories = CategoriesEntity.builder().categoryName("Famous").categoryThumbnail("https://kenyanmagazine.co.ke/wp-content/uploads/2021/07/IMG_20210714_122050_218.jpg").build();

        categoriesRepository.save(categories);
    }

    @Test
    public void getAllCategoriesAr(){
        List<CategoriesEntity> categoriesEntityArList = categoriesRepository.findAll();
        System.out.println("categories are : " + categoriesEntityArList);
    }
}