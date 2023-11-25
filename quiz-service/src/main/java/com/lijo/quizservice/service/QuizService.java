package com.lijo.quizservice.service;

import com.lijo.quizservice.dao.QuizDao;
import com.lijo.quizservice.feign.QuizInterface;
import com.lijo.quizservice.model.QuestionWrapper;
import com.lijo.quizservice.model.Quiz;
import com.lijo.quizservice.model.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class QuizService
{
    @Autowired
    QuizDao quizDao;

    @Autowired
    QuizInterface quizInterface;

    public ResponseEntity<String> createQuiz(String category, int numQ, String title)
    {

        // List<Integer> questions = //call the generate url - RestTemplate http://localhost:8080/question/generate
        List<Integer> questions = quizInterface.getQuestionsForQuiz(category, numQ).getBody();
        Quiz quiz = new Quiz();
        quiz.setTitle(title);
        quiz.setQuestionsIds(questions);
        quizDao.save(quiz);

        return new ResponseEntity<>("success", HttpStatus.CREATED);
    }

    public ResponseEntity<List<QuestionWrapper>> getQuizQuestions(Integer id)
    {
        /*Optional<Quiz> quiz = quizDao.findById(id);
        List<Question> questionsFromDB = quiz.get().getQuestions();
        */
        List<QuestionWrapper> questionForUser = new ArrayList<>();

        /*for(Question q : questionsFromDB)
        {
            QuestionWrapper qw = new QuestionWrapper(q.getId(), q.getQuestionTitle(), q.getOption1(), q.getOption2(), q.getOption3(), q.getOption4());
            questionForUser.add(qw);
        }*/
        return new ResponseEntity<>(questionForUser, HttpStatus.OK);
    }

    public ResponseEntity<Integer> calculateResult(Integer id, List<Response> responses)
    {
        /*Quiz quiz = quizDao.findById(id).get();
        List<Question> questions = quiz.getQuestions();*/

        int right = 0, i = 0;
        /*for(Response response : responses)
        {
            if(response.getResponse().equals(questions.get(i).getRightAnswer()))
                right++;

            i++;
        }*/
        return new ResponseEntity<>(right, HttpStatus.OK);
    }
}
