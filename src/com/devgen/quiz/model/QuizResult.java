package com.devgen.quiz.model;

public class QuizResult {
	
	private int correctAnswer;
	private int incorrectAnswer;
	private double percentage;
	private String suggestion;
	
	
	public QuizResult(int correctAnswer, int incorrectAnswer, double percentage, String suggestion) {
		super();
		this.correctAnswer = correctAnswer;
		this.incorrectAnswer = incorrectAnswer;
		this.percentage = percentage;
		this.suggestion = suggestion;
	}
	
	public int getCorrectAnswer() {
		return correctAnswer;
	}
	public int getIncorrectAnswer() {
		return incorrectAnswer;
	}
	public double getPercentage() {
		return percentage;
	}
	public String getSuggestion() {
		return suggestion;
	}

}
