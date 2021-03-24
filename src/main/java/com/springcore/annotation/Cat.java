package com.springcore.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Cat {

	private int id=0;
	private String speech="Dont't feel like";
	public int getId() {
		return id;
	}
	@Autowired
	public void setId(@Value("24") int id) {
		this.id = id;
	}
	public String getSpeech() {
		return speech;
	}
	@Autowired
	public void setSpeech(@Value("Meawow") String speech) {
		this.speech = speech;
	}
	
	public void speak() {
		System.out.println("Cat: "+id+" : "+speech);
	}
	
}
