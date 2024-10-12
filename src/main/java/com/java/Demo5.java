package com.java;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class Demo5 {

	public static void main(String[] args) {

		int [] arr= {4,7,3,2,9,6,1};
		LinkedHashMap<Integer, Integer> hs=new LinkedHashMap<Integer, Integer>();
		for (int i = 0; i < arr.length; i++) {
			hs.put(i, arr[i]);
					}
		for (int i = 1; i < arr.length; i++) {
			hs.put(arr.length+i,arr[0]+arr[i]);
		}
		System.out.println(hs.values());
	}

}
