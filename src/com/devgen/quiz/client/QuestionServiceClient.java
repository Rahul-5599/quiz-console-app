package com.devgen.quiz.client;

import com.devgen.quiz.model.Question;
import com.devgen.quiz.service.QuestionService;

public class QuestionServiceClient {
	
	public static void main(String[] args) {
		
		QuestionService questionService = new QuestionService();
		
		Question question1 = new Question(6, "What is 10 + 10 * 10", "100", "110", "120", "130", "110");
		questionService.addQuestion(question1);
		
		Question question2 = new Question(7, "What is 20 + 10 * 10 - 20", "100", "150", "200", "250", "100");
		questionService.addQuestion(question2);
		
		Question question3 = new Question(8, "What is 50 + 50 * 2", "100", "150", "200", "250", "150");
		questionService.addQuestion(question3);
		
		Question question4 = new Question(9, "What is 30 + 10 * 30", "300", "330", "400", "450", "330");
		questionService.addQuestion(question4);
		
		Question question5 = new Question(10, "What is 10 + 25 * 10", "200", "250", "260", "270", "260");
		questionService.addQuestion(question5);
	}
	

}
