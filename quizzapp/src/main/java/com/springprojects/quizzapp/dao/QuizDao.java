package com.springprojects.quizzapp.dao;

import com.springprojects.quizzapp.model.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface QuizDao extends JpaRepository<Quiz,Integer> {
//    @Query(value = "SELECT * FROM quiz_questions q Where q.quiz_id=:quizId", nativeQuery = true)
//    List<Quiz> findQuizFromId(Integer quizId);
}
