package com.zeke.JavaAnnotationDemo;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach {

	@Value("${zeke.email}")
	private String email;
	
	@Value("${zeke.team}")
	private String team;
	
	private FortuneService fortuneService;
	
	public SwimCoach() {
		// TODO Auto-generated constructor stub
	}
	
	public SwimCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Swim 50m";
	}
 
	@Override
	public String getDailyFortune() {
		return this.fortuneService.getFortune();
	}
	
	@Override
	public String toString() {
		return "Email: " + this.email + "\n Team: " + this.team;
	}

}
