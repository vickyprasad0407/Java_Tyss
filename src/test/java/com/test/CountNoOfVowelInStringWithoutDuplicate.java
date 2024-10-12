package com.test;

import java.util.LinkedHashSet;

public class CountNoOfVowelInStringWithoutDuplicate {

	public static void main(String[] args) {

		String s="tEstYanTrA";
		String st="aeiouAEIOU";
		int count=0;
		LinkedHashSet<Character> hs=new LinkedHashSet<Character>();
		for (int i = 0; i < s.length(); i++) {
			char ch=s.charAt(i);
            if(st.indexOf(ch)!=-1)
            {
            	count++;
            	hs.add(ch);
            }
		}
		System.out.println(hs+"...the no. of distinct vowel is "+hs.size());
		System.out.println("total no of vowels are "+count);
	}

}
