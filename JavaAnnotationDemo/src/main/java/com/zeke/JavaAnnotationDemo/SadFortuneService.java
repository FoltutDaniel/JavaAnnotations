package com.zeke.JavaAnnotationDemo;

import org.springframework.stereotype.Component;

@Component
public class SadFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Bad day today..";
	}

}
