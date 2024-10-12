package com.test;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListTopic {

	public static void main(String[] args) {

		ArrayList<Object> list=new ArrayList<Object>();
		list.add(10);
		list.add("hii");
		list.add(null);
		list.add(null);
		list.add(20);
		System.out.println(list);
		
		if(list.contains("hii"))
			System.out.println("present");
		else
			System.out.println("not present");
		list.add(3, "hello");
		System.out.println(list);
		list.set(2, "not null");
		System.out.println(list);
		list.remove(4);
		System.out.println(list);
		System.out.println(list.size());
		System.out.println(list.get(3));

		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(10);
		al.add(5);
		al.add(20);
		al.add(30);
		al.add(0);
		System.out.println(al);
	    al.remove((Integer)10);
		System.out.println(al);
		Collections.sort(al);
		System.out.println(al);
		
		al.contains(list);
		System.out.println(al);
		Object[] x= al.toArray();
		System.out.println(al.toArray());
		for (int i = 0; i < x.length; i++) {
			System.out.println(x[i]);
		}
	}

}
