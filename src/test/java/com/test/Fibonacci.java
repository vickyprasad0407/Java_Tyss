package com.test;

public class Fibonacci {

	public static void main(String[] args) {

		int n=6;
		int fib1=0;
		int fib2=1;
		int fib3=0;
		System.out.println(fib1);
		System.out.println(fib2);
		for (int i = 2; i < n; i++) {
			fib3=fib1+fib2;
			System.out.println(fib3);
			fib1=fib2;
			fib2=fib3;
			

		}
			}

}
