package com.test;

public class CountNoOfUpperCaseAndLowerCaseInaString {

	public static void main(String[] args) {

		String s="TestYantri";
		int uppercase=0;
		int lowercase=0;
		for (int i = 0; i < s.length(); i++) {
			char ch=s.charAt(i);
			if(ch>='A' && ch<='Z')
				uppercase++;
			else if(ch>='a' && ch<='z')
				lowercase++;
		}
		System.out.println("no of upper case "+uppercase);
		System.out.println("no of lower case "+lowercase);
	}

}
