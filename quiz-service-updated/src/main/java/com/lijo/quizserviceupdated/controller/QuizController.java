package com.lijo.quizserviceupdated.controller;

import com.lijo.quizserviceupdated.model.QuestionWrapper;
import com.lijo.quizserviceupdated.model.QuizDto;
import com.lijo.quizserviceupdated.model.Response;
import com.lijo.quizserviceupdated.service.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("quiz")
public class QuizController
{
    @Autowired
    QuizService quizService;
    @PostMapping("create")
    public ResponseEntity<String> createQuiz(@RequestBody QuizDto quizDto)
    {

        return quizService.createQuiz(quizDto.getCategoryName(), quizDto.getNumQuestions(), quizDto.getTitle());
    }

    @GetMapping("get/{id}")
    public ResponseEntity<List<QuestionWrapper>> getQuizQuestions(@PathVariable Integer id)
    {
        return quizService.getQuizQuestions(id);
    }

    @PostMapping("submit/{id}")
    public ResponseEntity<Integer> submitQuiz(@PathVariable Integer id, @RequestBody List<Response> responses)
    {
        return quizService.calculateResult(id, responses);
    }
}
