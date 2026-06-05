package com.devgen.quiz.service;

import com.devgen.quiz.model.Question;

public class QuestionService {

    //QuestionService is used for Maintaining Questions. - by using ( CRUD ) operation -Create, Read, Update, Delete 

    private Question[] questions = new Question[5];
    
   
    
    public QuestionService() {
    	
    	questions[0] = new Question(1,"What is 2 + 2", "4","3","2","5","4");
    	questions[1] = new Question(2,"What is 2 + 3", "4","3","2","5","5");
    	questions[2] = new Question(3,"What is 1 + 2", "4","3","2","5","3");
    	questions[3] = new Question(4,"What is 2 + 2 + 3 - 3", "4","3","2","5","4");
    	questions[4] = new Question(5,"What is 2 + 5 - 6", "4","3","2","1","1");
    	 
    }
    
    public String addQuestion(Question question) {
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