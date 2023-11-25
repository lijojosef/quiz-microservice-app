package com.lijo.quizservice.dao;


import com.lijo.quizservice.model.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuizDao extends JpaRepository<Quiz, Integer>
{

}
