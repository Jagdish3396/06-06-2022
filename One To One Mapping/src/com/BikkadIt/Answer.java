package com.BikkadIt;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Answer {
	@Id
	private int aid;
	private String answer;
	/*
	 * private Question question;
	 * 
	 * //public Question getQuestion() { return question; }
	 * 
	 * public void setQuestion(Question question) { this.question = question; }
	 */

	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}
}
