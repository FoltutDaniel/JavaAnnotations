package com.zeke.JavaAnnotationDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TrackCoach implements Coach {
	
	
	@Autowired
	@Qualifier("happyFortuneService")
	private FortuneService fortuneService;
	
	public TrackCoach() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String getDailyWorkout() {
		return "run";
	}

	@Override
	public String getDailyFortune() {
		return this.fortuneService.getFortune();
	}

}
