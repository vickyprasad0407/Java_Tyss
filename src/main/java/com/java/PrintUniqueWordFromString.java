// print unique word from a string
package com.java;

import java.util.HashSet;
import java.util.Spliterator;

public class PrintUniqueWordFromString {

	public static void main(String[] args) {

		String s="I am from from am Testyantra";
		String [] st=s.split("\\s");
		HashSet<String> hs=new HashSet<String>();
		for (String string : st) {
			hs.add(string);
           		}
           System.out.println(hs);
		}
	}


