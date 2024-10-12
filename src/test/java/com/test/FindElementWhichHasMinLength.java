package com.test;

import java.util.TreeSet;

public class FindElementWhichHasMinLength {

	public static void main(String[] args) {

		String [] a= {"1323","13","124564","22","1212333"};
		/*int siz=0;
		String ele="";
		for (String string : a) {
			for (String string2 : a) {
               if(string.length()<string2.length())
               {
            	   siz=string.length();
            	   ele=string;   
               }
			}
		}
		System.out.println(ele+"...."+siz);
		*/
		/*TreeSet t=new TreeSet(new MyComparable());
		for (String string : a) {
			t.add(string);
		}
		String small=(String) t.toArray()[0];
		System.out.println(small+"......"+small.length());
		*/
		int min=a[0].length();
		int index=0;
		for (int i = 0; i < a.length; i++) {
			if(min>a[i].length())
			{
				min=a[i].length();
				index=i;
			}
		}
		System.out.println(a[index]+"....."+min);
	}

}
