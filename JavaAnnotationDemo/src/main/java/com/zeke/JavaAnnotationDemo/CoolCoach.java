package com.zeke.JavaAnnotationDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class CoolCoach implements Coach{
	
	@Value("${zeke.email}")
	private String emailAdress;
	
	@Value("${zeke.team}")
	private String team;
	
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public String toString() {
		return "Email: " + this.emailAdress + "\n Team: " + this.team;
	}

}
