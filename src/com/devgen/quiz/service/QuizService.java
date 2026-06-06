package com.devgen.quiz.service;

import java.util.Scanner;

import com.devgen.quiz.model.Question;
import com.devgen.quiz.model.QuizResult;

public class QuizService {
	
	private String[] userAnswered = new String[5];
	private Question[] questions;
	QuestionService questionService;
	
	public QuizService(QuestionService questionService) {
		this.questionService = questionService; 
		questions = questionService.getAllQuestion();
	}

	
public void playQuiz() {
    	
    	Scanner scanner = new Scanner(System.in);
    	
    	for (int i = 0; i< questions.length; i++) {
        	System.out.println("Que.Id." + questions[i].getId());
        	System.out.println("Question: " + questions[i].getQuestion());
        	System.out.println( questions[i].getOption1());
        	System.out.println( questions[i].getOption2());
        	System.out.println( questions[i].getOption3());
        	System.out.println( questions[i].getOption4());
        	
        	
        	
        	userAnswered[i] = scanner.next();
        }
    	scanner.close();
    }
    
    public QuizResult getResult() {
    	
    	int correctAnswer = 0;
    	for(int i=0; i < userAnswered.length; i++) {
    		if(questions[i].getAnswer().equals(userAnswered[i])) {
    			correctAnswer++;
    		}
    	}
    	
    	int incorrectAnswer = questions.length - correctAnswer;
    	
    	double percentage = ((double)correctAnswer / questions.length) * 100;
    	
    	String suggestion = getSuggestion(percentage);
    	    	
    	QuizResult quizResult = new QuizResult(correctAnswer, incorrectAnswer, percentage, suggestion);
    	
    	return quizResult;
    	
    	
    	
    }
    
    private String getSuggestion(double percentage) {
    	
    	String suggestion = "";
    	
    	if(percentage>=0 && percentage<=30) {
    		suggestion = "You Must Study Harder";
    	} else if(percentage>=31 && percentage<=60) {
    		suggestion = "You are Studing Good. Need Some More Study.";
    	} else if(percentage>=61 && percentage<=90) {
    		suggestion = "You are Becoming Topper and just bit of extra efforts little required";
    	} else {
    		suggestion = "You are very good at concepts and being into top list";
    	}
    	return suggestion;
    }
	
    
	
}
