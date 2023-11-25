package com.lijo.questionservice.dao;

import com.lijo.questionservice.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuestionDao extends JpaRepository <Question, Integer>
{
    List<Question> findByCategory(String category);

    @Query(value="SELECT Q.ID FROM QUESTION Q WHERE Q.CATEGORY =:category ORDER BY RAND() LIMIT :numQ", nativeQuery = true)
    List<Integer> findRandomQuestionsByCategory(String category, int numQ);
    /*List<Question> findByCategory(String category);*/
}
