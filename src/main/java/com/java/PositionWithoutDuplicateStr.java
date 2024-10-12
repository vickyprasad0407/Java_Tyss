package com.java;

import java.util.ArrayList;
// postion of each word of string without duplicatae
import java.util.HashSet;

public class PositionWithoutDuplicateStr {

	public static void main(String[] args) {

		String s="I am from from am Testyantra";
		String [] st=s.split("\\s");
		HashSet<String> hs=new HashSet<String>();
		ArrayList<String> al=new ArrayList<String>();
		for (String string : st) {
			hs.add(string);
			al.add(string);
           		}
		for (String string : hs) {
			for (int i = 0; i < al.size(); i++) {
				if(string.equals(al.get(i)))
				{
					System.out.println(string+"......."+(i+1));
					break;
				}
			}
				
		}
		}

	}


