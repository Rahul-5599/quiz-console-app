package com.devgen.quiz.service;

import com.devgen.quiz.model.Question;

public class QuestionService {

    //QuestionService is used for Maintaining Questions. - by using ( CRUD ) operation -Create, Read, Update, Delete 

    private Question[] questions; // = new Question[10];
    private int current;
    
   
    
    public QuestionService(int size) {
    	
    	questions = new Question[size];
    	
    	intializeDefaultQuestions(); 
    	 
    }

	private void intializeDefaultQuestions() {
		questions[current] = new Question(1,"What is 2 + 2",new String[] {"4","3","2","5"},1);
    	current++; 
    	
    	questions[current] = new Question(2,"Does Java is Object Oriented Lang ?", new String[] {"true","false"},1);
    	current++; 
    	
    	questions[current] = new Question(3,"What is 1 + 2", new String[] {"4","3","2","5"},1);
    	current++; 
    	
    	questions[current] = new Question(4,"How fo you create variable with numeric value 5?", new String[] {"int x=5","float f=4.5","num x=5"},1);
    	current++; 
    	
    	questions[current] = new Question(5,"What is 2 + 5 - 6", new String[] {"4","3","2","1"},4);
    	current++;
	}
    
    public void addQuestion(Question question) {
    	questions[current] = question;
    	current++; 
    	System.out.println("Question Added Successfully");
    }
    
    public void updateQuestion(Question modifiedQuestion) {
    	
    	//1.Find the question for Given id.
    	
    	int id = modifiedQuestion.getId();
    	
    	for(int i = 0; i< questions.length; i++) {
    		if(id == questions[i].getId()) {
    			questions[i] =  modifiedQuestion;
    		}
    	}
    	
    	
    	System.out.println("Updated Question Successfully");
    }
    
    public void deleteQuestion(int id) {
    	System.out.println("Question Deleted Successfully");
    }
    
    public Question[] getAllQuestion() {
    	return questions;
    }

}