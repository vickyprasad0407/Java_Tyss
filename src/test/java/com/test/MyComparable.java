package com.test;

import java.util.Comparator;

public class MyComparable implements Comparator {

	public int compare(Object o1, Object o2) {
         String s1=(String)o1;
         String s2=(String)o2;
         int l1=s1.length();
         int l2=s2.length();
         if(l1<l2)
        	 return -1;
         else if(l1>l2)
        	 return +1;
         else
         {
        	 return s1.compareTo(s2);
         }
	}

	
}
