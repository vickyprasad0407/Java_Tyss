package com.test;


public class LinkedHashSet {

	public static void main(String[] args) {

		java.util.LinkedHashSet<Object> set=new java.util.LinkedHashSet<Object>();
		set.add(40);
		set.add("hii");
		set.add("hello");
		set.add("hii");
		set.add(null);
		set.add(null);
		System.out.println(set);
	}

}
