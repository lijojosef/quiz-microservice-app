package com.lijo.quizserviceupdated.dao;

import com.lijo.quizserviceupdated.model.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuizDao extends JpaRepository<Quiz, Integer>
{

}
