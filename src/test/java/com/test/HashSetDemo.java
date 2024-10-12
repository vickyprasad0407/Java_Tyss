package com.test;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {

		HashSet<Object> set=new HashSet<Object>();
		set.add(40);
		set.add("hii");
		set.add("hello");
		set.add("hii");
		set.add(null);
		set.add(null);
		System.out.println(set);
	}

}
