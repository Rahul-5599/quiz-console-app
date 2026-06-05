package com.devgen.quiz.service;

import java.util.Scanner;

import com.devgen.quiz.model.Question;

public class QuizService {
	
	private String[] userAnswered = new String[5];
	private Question[] questions;
	
	public QuizService() {
		QuestionService questionService = new QuestionService();
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
    
    public void playFinalResult() {
    	
    	int correctAnswer = 0;
    	for(int i=0; i < userAnswered.length; i++) {
    		if(questions[i].getAnswer().equals(userAnswered[i])) {
    			correctAnswer++;
    		}
    	}
    	
    	int incorrectAnswer = questions.length - correctAnswer;
    	
    	double percentage = ((double)correctAnswer / questions.length) * 100;
    	
    	System.out.println("Your Correct Question: " + correctAnswer);
    	System.out.println("Your InCorrect Question: " + incorrectAnswer);
    	System.out.println("Your Percentage is:  " + percentage );
    	
    	
    	
    }
	
	
}
