package com.devgen.quiz.service;

import java.util.Scanner;

import com.devgen.quiz.model.Question;

public class QuestionService {

    //QuestionService is used for Maintaining Questions. - by using ( CRUD ) operation -Create, Read, Update, Delete 

    private Question[] questions = new Question[5];
    private String[] userAnswered = new String[5];
   
    
    public QuestionService() {
    	
    	questions[0] = new Question(1,"What is 2 + 2", "4","3","2","5","4");
    	questions[1] = new Question(2,"What is 2 + 3", "4","3","2","5","5");
    	questions[2] = new Question(3,"What is 1 + 2", "4","3","2","5","3");
    	questions[3] = new Question(4,"What is 2 + 2 + 3 - 3", "4","3","2","5","4");
    	questions[4] = new Question(5,"What is 2 + 5 - 6", "4","3","2","1","1");
    	 
    }
    
    public void playQuiz() {
    	for (int i = 0; i< questions.length; i++) {
        	System.out.println("Que.Id." + questions[i].getId());
        	System.out.println("Question: " + questions[i].getQuestion());
        	System.out.println( questions[i].getOption1());
        	System.out.println( questions[i].getOption2());
        	System.out.println( questions[i].getOption3());
        	System.out.println( questions[i].getOption4());
        	
        	Scanner scanner = new Scanner(System.in);
        	
        	userAnswered[i] = scanner.next();
        }
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