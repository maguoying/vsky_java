package com.magy.spring.dto;

import org.springframework.stereotype.Component;

@Component
public class EnglishTeacher extends Teacher {
	private int number;
	
	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public void teach() {
		System.out.println("开始上课");
	}
}
