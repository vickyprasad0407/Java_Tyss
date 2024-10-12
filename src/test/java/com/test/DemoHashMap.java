package com.test;

import java.util.HashMap;
import java.util.Hashtable;

public class DemoHashMap {

	public static void main(String[] args) {

		Hashtable<Integer, Object> map=new Hashtable<Integer, Object>();
		map.put(10, 30);
		map.put(20,"hello");
		map.put(50, 90);
		//map.put(null, 30);
		//map.put(50, null);
		map.put(50, "hii");
		map.put(50, "hell");
		
		System.out.println(map);
		HashMap<Object,Integer> hs=new HashMap<Object, Integer>();
		hs.put(null, 10);
		hs.put(null,30);
		hs.put(null, null);
		hs.put(30, null);
		System.out.println(hs);
		
	}

}
