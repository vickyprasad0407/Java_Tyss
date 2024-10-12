//count occurance of each character
package com.java;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class OccuranceOfEachCharacter {

	public static void main(String[] args) {

		String s1="TestYantra";
		String s=s1.toLowerCase();
		LinkedHashSet<Character> hs=new LinkedHashSet<Character>();
		for (int i = 0; i <s.length(); i++) {
			char ch=s.charAt(i);
			hs.add(ch);
			
		}
		for (Character character : hs) {
			int count=0;
			for (int i = 0; i < s.length(); i++) {
				if(character==s.charAt(i))
				{
					count++;
				}
			}
			System.out.println(character+"....."+count);
		}
		
	}

}
