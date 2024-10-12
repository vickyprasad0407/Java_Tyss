package com.test;

import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {

		TreeMap<Character, Object> map=new TreeMap<Character, Object>();
		map.put('d', 50);
		map.put('g', "hii");
		map.put('z', 90);
		map.put('b', "hello");
		map.put('m', 1000);
		map.put('c', "hii");
		map.put('d', 60);
		//map.put(null,50);
		map.put('t', null);
		map.put('x', 60);
		System.out.println(map);
	}

}
