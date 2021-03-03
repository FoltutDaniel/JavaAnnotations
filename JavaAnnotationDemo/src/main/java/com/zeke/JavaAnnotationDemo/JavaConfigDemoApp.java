package com.zeke.JavaAnnotationDemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JavaConfigDemoApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
    	//get the bean from spring container
    	Coach coach1 = context.getBean("tennisCoach",Coach.class); //constructor injection
    	Coach coach2 = context.getBean("footballCoach",Coach.class); //setter injection
    	Coach coach3 = context.getBean("trackCoach",Coach.class); //field injection
    	Coach coach4 = context.getBean("sadCoach",Coach.class); //field injection with qualifier
    	Coach coach5 = context.getBean("coolCoach",Coach.class);//properties file with java annotations
    	Coach coach6 = context.getBean("swimCoach",Coach.class); //Bean definition with dependency injection
    	System.out.println(coach1.getDailyWorkout());
    	System.out.println(coach1.getDailyFortune());
    	System.out.println(coach2.getDailyWorkout());
    	System.out.println(coach2.getDailyFortune());
    	System.out.println(coach3.getDailyWorkout());
    	System.out.println(coach3.getDailyFortune());
    	System.out.println(coach4.getDailyWorkout());
    	System.out.println(coach4.getDailyFortune());
    	System.out.println(coach5.toString());
    	System.out.println(coach6.getDailyWorkout());
    	System.out.println(coach6.getDailyFortune());
    	System.out.println(coach6.toString());
    	//close context
    	//close context
    	context.close();

	}

}
