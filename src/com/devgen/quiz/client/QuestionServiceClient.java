package com.devgen.quiz.client;

import com.devgen.quiz.model.Question;
import com.devgen.quiz.service.QuestionService;

public class QuestionServiceClient {
	
	public static void main(String[] args) {
		
		QuestionService questionService = new QuestionService(10);
		
		Question question1 = new Question(6, "What is 10 + 10 * 10", new String[] {"100", "110", "120", "130"}, 2);
		questionService.addQuestion(question1);
		
		Question question2 = new Question(7, "What is 20 + 10 * 10 - 20", new String[] {"100", "150", "200", "250"}, 1);
		questionService.addQuestion(question2);
		
		Question question3 = new Question(8, "What is 50 + 50 * 2", new String[] {"100", "150", "200", "250"}, 2);
		questionService.addQuestion(question3);
		
		Question question4 = new Question(9, "What is 30 + 10 * 30", new String[] {"300", "330", "400", "450"}, 2);
		questionService.addQuestion(question4);
		
		Question question5 = new Question(10, "What is 10 + 25 * 10", new String[] {"200", "250", "260", "270"}, 3);
		questionService.addQuestion(question5);
		
		Question[] questions = questionService.getAllQuestion();
		Question originalQuestion = questions[2];
		originalQuestion.setAnswer(2); // updated new answer
		originalQuestion.setQuestion("What is one + two");
		
		questionService.updateQuestion(originalQuestion);
		
		
		questions = questionService.getAllQuestion();
		for(Question q : questions)
			System.out.println(q);
		
		System.out.println("------------------------------------------------------------------------");
		
		questionService.deleteQuestion(4);
		questionService.deleteQuestion(1);
		questionService.deleteQuestion(6);
		questionService.deleteQuestion(8);
		
		questions = questionService.getAllQuestion();
		for(Question q : questions)
			System.out.println(q);
		
 	}
	

}
