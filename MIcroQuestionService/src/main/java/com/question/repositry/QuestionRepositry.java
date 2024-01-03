package com.question.repositry;

import com.question.entities.Question;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface QuestionRepositry extends JpaRepository<Question, Long> {

    List<Question> findByQuizId(Long quizId);
}
