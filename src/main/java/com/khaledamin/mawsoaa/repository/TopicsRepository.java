package com.khaledamin.mawsoaa.repository;

import com.khaledamin.mawsoaa.entity.TopicsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TopicsRepository extends JpaRepository<TopicsEntity,Long> {


public List<TopicsEntity> findByCategoryId(long categoryId);

public List<TopicsEntity> findByTopicTitleContainingIgnoreCase(String title);

public List<TopicsEntity> findByTopicTitleArContainingIgnoreCase(String title);

@Query(value = "SELECT * FROM topics WHERE topic_title LIKE ?1 OR topic_title_ar LIKE ?1",nativeQuery = true)
public List<TopicsEntity> findTopics(String title);

}
