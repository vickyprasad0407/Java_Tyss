package com.test;

public class CountNoOfVowelsInString {

	public static void main(String[] args) {

		String s="testyantra";
		String st="aeiouAEIOU";
		int count=0;
		for (int i = 0; i < s.length(); i++) {
			char ch=s.charAt(i);
            if(st.indexOf(ch)!=-1)
            {
            	count++;
            	System.out.print(ch);
            }
		}
		System.out.println();
		System.out.println("no of vowels are "+count);
	}

}
