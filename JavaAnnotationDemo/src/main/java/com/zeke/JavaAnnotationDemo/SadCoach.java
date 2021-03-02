package com.zeke.JavaAnnotationDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class SadCoach implements Coach {

	@Autowired
	@Qualifier("sadFortuneService")
	private FortuneService fortuneService;
	
	@Override
	public String getDailyWorkout() {
		return "Everything is pointless";
	}

	@Override
	public String getDailyFortune() {
		return this.fortuneService.getFortune();
	}

}
