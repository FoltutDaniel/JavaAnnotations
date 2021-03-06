package com.zeke.JavaAnnotationDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
       //read spring config file
    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
    	//get the bean from spring container
    	Coach coach1 = context.getBean("tennisCoach",Coach.class); //constructor injection
    	Coach coach2 = context.getBean("footballCoach",Coach.class); //setter injection
    	Coach coach3 = context.getBean("trackCoach",Coach.class); //field injection
    	Coach coach4 = context.getBean("sadCoach",Coach.class); //field injection with qualifier
    	Coach coach5 = context.getBean("coolCoach",Coach.class);//properties file with java annotations
    	
    	System.out.println(coach1.getDailyWorkout());
    	System.out.println(coach1.getDailyFortune());
    	System.out.println(coach2.getDailyWorkout());
    	System.out.println(coach2.getDailyFortune());
    	System.out.println(coach3.getDailyWorkout());
    	System.out.println(coach3.getDailyFortune());
    	System.out.println(coach4.getDailyWorkout());
    	System.out.println(coach4.getDailyFortune());
    	System.out.println(coach5.toString());
    	//close context
    	//close context
    	context.close();
    }
}
