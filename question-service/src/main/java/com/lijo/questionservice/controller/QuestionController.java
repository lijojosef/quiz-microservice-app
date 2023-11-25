package com.lijo.questionservice.controller;

import com.lijo.questionservice.model.Question;
import com.lijo.questionservice.model.QuestionWrapper;
import com.lijo.questionservice.model.Response;
import com.lijo.questionservice.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("question")
public class QuestionController {

    @Autowired
    QuestionService questionService;

    @Autowired
    Environment environment;
    // to get all the questions
    @GetMapping("allquestions")
    public ResponseEntity<List<Question>> getAllQuestions() {

        return questionService.getAllQuestions();
    }

    // to get category wise result
    @GetMapping("category/{category}")
    public ResponseEntity<List<Question>> getQuestionsByCategory(@PathVariable String category) {
        return questionService.getQuestionsByCategory(category);
    }

    // to add records
    @PostMapping("add")
    public ResponseEntity<String> addQuestion(@RequestBody Question question) {
        return questionService.addQuestion(question);
    }

    // to delete records
    @DeleteMapping("delete/{aid}")
    public ResponseEntity<String> deleteQuestion(@PathVariable("aid") int aid) {
        return questionService.deleteQuestion(aid);
    }

    // to update records
    @PutMapping("update/{aid}")
    public ResponseEntity<String> updateQuestion(@RequestBody Question question) {
        return questionService.saveOrUpdateQuestion(question);
    }

    // generate
    @GetMapping("generate")
    public ResponseEntity<List<Integer>> getQuestionsForQuiz(@RequestParam String categoryName, @RequestParam Integer numQuestions) {
        return questionService.getQuestionsForQuiz(categoryName, numQuestions);
    }

    // getQuestions (questionid)
    @PostMapping("getQuestions")
    public ResponseEntity<List<QuestionWrapper>> getQuestionsFromId(@RequestBody List<Integer> questionIds) {
        System.out.println(environment.getProperty("local.server.port"));
        return questionService.getQuestionsFromId(questionIds);
    }

    // getScore
    @PostMapping("getScore")
    public ResponseEntity<Integer> getScore(@RequestBody List<Response> responses)
    {
        return questionService.getScore(responses);
    }
}
