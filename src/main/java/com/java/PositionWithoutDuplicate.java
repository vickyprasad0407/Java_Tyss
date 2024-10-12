//position of each character without duplicate
package com.java;

import java.util.LinkedHashSet;

public class PositionWithoutDuplicate {

	public static void main(String[] args) {

		String s1="TestYantra";
		String s=s1.toLowerCase();
		LinkedHashSet<Character> hs=new LinkedHashSet<Character>();
		for (int i = 0; i < s.length(); i++) {
			hs.add(s.charAt(i));
		}
		for (Character character : hs) {
			for (int i = 0; i < s.length(); i++) {
				if(character==s.charAt(i))
				{
					System.out.println(character+"....."+(i+1));
					break;
				}
			}
		}
	}

}
