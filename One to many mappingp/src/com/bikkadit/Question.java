package com.bikkadit;

import java.util.List;

import javax.persistence.OneToMany;

public class Question {
	private int qid;
	private String question;
	@OneToMany
	private List< Answer>  answer;

	public void setAnswer(List<Answer> answer) {
		this.answer = answer;
	}

	public int getQid() {
		return qid;
	}

	public void setQid(int qid) {
		this.qid = qid;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}



	@Override
	public String toString() {
		return "Question [qid=" + qid + ", question=" + question + ", answer=" + answer + "]";
	}

}
