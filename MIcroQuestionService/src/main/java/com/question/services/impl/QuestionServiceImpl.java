package com.question.services.impl;

import com.question.entities.Question;
import com.question.repositry.QuestionRepositry;
import com.question.services.QuestionService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionServiceImpl implements QuestionService {

    private QuestionRepositry questionRepositry;

    public QuestionServiceImpl(QuestionRepositry questionRepositry) {
        this.questionRepositry = questionRepositry;
    }

    @Override
    public Question create(Question question) {
        return questionRepositry.save(question);
    }

    @Override
    public List<Question> get() {
        return questionRepositry.findAll();
    }

    @Override
    public Question get(Long id) {
        return questionRepositry.findById(id).orElseThrow(() -> new RuntimeException("question not found"));
    }

    @Override
    public List<Question> getQuestionsByQuizId(Long quizId) {
        return questionRepositry.findByQuizId(quizId);
    }
}
