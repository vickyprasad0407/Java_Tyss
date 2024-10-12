// position of each character with duplicates
package com.java;

public class PositionOfEachCharacter {

	public static void main(String[] args) {

		String s="TestYantra";
		for (int i = 0; i < s.length(); i++) {
			char ch=s.charAt(i);
			System.out.println(ch+"....."+(i+1));
		}
	}

}
