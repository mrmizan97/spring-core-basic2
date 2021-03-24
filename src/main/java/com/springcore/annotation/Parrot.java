package com.springcore.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Parrot {

	private String id="12";
	private String speech="parrot's speech";
	public String getId() {
		return id;
	}
	@Autowired
	public void setId(@Value("${jdbc.username}") String id) {
		this.id = id;
	}
	public String getSpeech() {
		return speech;
	}
	@Autowired
	public void setSpeech(@Value("${jdbc.password}") String speech) {
		this.speech = speech;
	}
	public void speak() {
		System.out.println(id+" : "+speech);
	}
}
