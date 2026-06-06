package com.devgen.quiz.client;

import com.devgen.quiz.model.QuizResult;
import com.devgen.quiz.service.QuestionService;
import com.devgen.quiz.service.QuizService;

public class QuizAppClient {
	 
	public static void main(String[] args) {
		
		QuestionService questionService = new QuestionService(5); 
		QuizService quizService = new QuizService(questionService);
		quizService.playQuiz();
		
		QuizResult result = quizService.getResult();
		System.out.println("Your Correct Answer:- " + result.getCorrectAnswer());
		System.out.println("Your InCorrect Answer:- " + result.getIncorrectAnswer());
		System.out.println("Your Percentage:- " + result.getPercentage());
		System.out.println("Your Suggestion:- " + result.getSuggestion());
		
	}
    
}
  