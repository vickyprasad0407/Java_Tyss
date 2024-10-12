package com.java;

import java.util.Scanner;

public class MinuteHandAndHourHand {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the time");
		double hr=sc.nextDouble();
		double min=sc.nextDouble();
	    hr=hr*60*0.5+min*0.5;
	    min=min*6;
	    double angle=hr-min;
	    if(angle<0)
	    	System.out.println(360+angle);
	    else
	    	System.out.println(angle);
	    	}
}
