//print unique character in a sTring
//TestYantra
package com.java;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class UniqueCharacter {

	public static void main(String[] args) {

		String s1="TestYantra";
		String s=s1.toLowerCase();
		LinkedHashSet<Character> hs=new LinkedHashSet<Character>();
		for (int i = 0; i < s.length(); i++) {
			char ch=s.charAt(i);
			hs.add(ch);
		}
		System.out.println(hs);
	}

}
