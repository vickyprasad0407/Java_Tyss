package com.test;

public class SumOfDigitInString {

	public static void main(String[] args) {

		String s="b2v4d6";
		int sum=0;
		String dig="";
		for (int i = 0; i <s.length(); i++) {
			char ch=s.charAt(i);
			if(ch>='0' && ch<='9')
			{
				dig=dig+ch;
				int x=Integer.parseInt(dig);
				sum=sum+x;
				dig="";
			}
		}
		System.out.println(sum);
		 
		
		/*int sum=0;
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i)>='0' && s.charAt(i)<='9')
			{
				int n=s.charAt(i)-48;
				sum=sum+n;
			}
		}
		System.out.println(sum);
		*/
	}

}
