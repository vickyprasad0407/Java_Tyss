package com.test;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args)
	{
       int n=100;
       for(int i=0;i<=n;i++)
       {
    	   boolean b=isPrime(i);
    	   if(b)
    		   System.out.println(i);
       }
	}
	public static boolean isPrime(int n)
	{
		boolean flag=true;
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
				flag=false;
		}
		return flag;
	}
}
