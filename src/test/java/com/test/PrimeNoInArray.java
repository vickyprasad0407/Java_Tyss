package com.test;

public class PrimeNoInArray {

	public static void main(String[] args) {

		int [] x= {1,2,3,4,5,6,7,8,9};
		
		for (int x1 : x) {
			boolean flag=true;
			for (int i=2;i<=x1/2;i++) {
				if(x1%i==0)
				{
					flag=false;
					break;
				}
			}
			if(flag)
				System.out.println(x1);
			
		}
	}

}
