package com.test;

public class PrimeNoFrom1to100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean flag=true;
		for (int i = 1; i <= 100; i++) {
			for (int j = 2; j <= 50; j++) {
				if(i%j==0)
				{
					flag=false;
				}
			}
			if(flag)
				System.out.println(i);
		}

	}

}
