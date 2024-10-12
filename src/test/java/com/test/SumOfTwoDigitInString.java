package com.test;

import java.util.LinkedList;

public class SumOfTwoDigitInString {

	public static void main(String[] args) {

		String s="11d123e3";//if no of digit is more than 2 it will consider whole digit before character
		int sum=0;
		int tsum=0;
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i)>='0' && s.charAt(i)<='9')
			{
				int n=s.charAt(i)-48;
				tsum=tsum*10+n;
			}
			else
			{
				sum=sum+tsum;
				tsum=0;
			}
		}
		sum=sum+tsum;
		System.out.println(sum);
		
	}

}
