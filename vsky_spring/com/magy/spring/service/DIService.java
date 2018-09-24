package com.magy.spring.service;

import javax.annotation.Resource;

import com.magy.spring.dto.EnglishTeacher;

public class DIService {

	@Resource
	private EnglishTeacher englishTeacher;

	public EnglishTeacher getEnglishTeacher() {
		return englishTeacher;
	}

	public void setEnglishTeacher(EnglishTeacher englishTeacher) {
		this.englishTeacher = englishTeacher;
	}

}
