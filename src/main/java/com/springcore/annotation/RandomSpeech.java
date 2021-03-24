package com.springcore.annotation;

import java.util.Random;

public class RandomSpeech {

	private static String[] texts= {
			"I'll go back",
			"Get out from here",
			"I want your clothes, boots and motorcycle.",
			null
	};

	public  String getTexts() {
		Random random=new Random();
		
		return texts[random.nextInt(texts.length)];
	}

	
	
}
