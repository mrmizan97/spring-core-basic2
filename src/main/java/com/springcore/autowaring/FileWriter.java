package com.springcore.autowaring;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("fileWriter")
public class FileWriter implements LogWriter{

	public void write(String text) {
		// TODO Auto-generated method stub
		System.out.println("Log to file: "+text);
	}

}
