package com.test;

import java.util.LinkedHashSet;

public class RemoveDuplicateInArray {

	public static void main(String[] args) {

		int [] a= {2,3,2,1,0,3};
		LinkedHashSet<Integer> set=new LinkedHashSet<Integer>();
		for (int i = 0; i < a.length; i++) {
			set.add(a[i]);
		}
		System.out.println(set);
		
	}

}
