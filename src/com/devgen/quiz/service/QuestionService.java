package com.devgen.quiz.service;

import com.devgen.quiz.model.Question;

public class QuestionService {

    //QuestionService is used for Maintaining Questions. - by using ( CRUD ) operation -Create, Read, Update, Delete 

    private Question[] questions; // = new Question[10];
    private int current;
    
   
    
    public QuestionService(int size) {
    	
    	questions = new Question[size];
    	
    	questions[current] = new Question(1,"What is 2 + 2", "4","3","2","5","4");
    	current++; 
    	
    	questions[current] = new Question(2,"What is 2 + 3", "4","3","2","5","5");
    	current++; 
    	
    	questions[current] = new Question(3,"What is 1 + 2", "4","3","2","5","3");
    	current++; 
    	
    	questions[current] = new Question(4,"What is 2 + 2 + 3 - 3", "4","3","2","5","4");
    	current++; 
    	
    	questions[current] = new Question(5,"What is 2 + 5 - 6", "4","3","2","1","1");
    	current++; 
    	 
    }
    
    public String addQuestion(Question question) {
    	questions[current] = question;
    	current++; 
    	return "Question Added Successfully";
    }
    
    public String updateQuestion(Question question) {
    	return "Updated Question Successfully";
    }
    
    public String deleteQuestion(int id) {
    	return "Question Deleted Successfully";
    }
    
    public Question[] getAllQuestion() {
    	return questions;
    }

}