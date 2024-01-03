package com.quiz.service;

import com.quiz.entites.Question;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

//@FeignClient(url = "http://localhost:8083", value = "Question-Client") //For single instance
@FeignClient(name = "QUESTION-SERVICE") //"QUESTION-SERVICE" this name has being configured in the application.properties file of the question service
public interface QuestionClient{

    @GetMapping("/question/quiz/{quizId}")
    List<Question> getQuestionsOfQuiz(@PathVariable Long quizId);
}
