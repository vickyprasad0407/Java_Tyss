// count how many times duplicates word are repeated
package com.java;

import java.util.HashSet;

public class CountStDuplicate {

	public static void main(String[] args) {

		String s="I am from from am Testyantra";
		String [] st=s.split("\\s");
		HashSet<String> hs=new HashSet<String>();
		for (String string : st) {
			hs.add(string);
		}
		for (String string : hs) {
			int count=0;
			for (String string2 : st) {
				if(string.equals(string2))
				{
					count++;
				}
			}
			if(count>1)
			System.out.println(string+"......"+count);
		}

	}

}
