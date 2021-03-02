package com.zeke.JavaAnnotationDemo;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Your luck day today!";
	}

}
