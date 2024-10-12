package com.test;

import java.util.LinkedHashSet;

public class OccuranceOfEachWordInString {

	public static void main(String[] args) {

		String s="welcome to city to Bengaluru city";
		String [] st=s.split(" ");
		LinkedHashSet<String> hs=new LinkedHashSet<String>();
		for (String string : st) {
			hs.add(string);
		}
		for (String string : hs) {
			int count=0;
			for (int i = 0; i < st.length; i++) {
				if(string.equals(st[i]))
					count++;
			}
			System.out.println(string+"----->"+count);
		}
	}

}
