package com.springcore.autowaring;

import org.springframework.stereotype.Component;

@Component
public class ConsoleWriter implements LogWriter{

	public void write(String text) {
		// TODO Auto-generated method stub
		System.out.println("Log to console:"+text);
		
	}

}
