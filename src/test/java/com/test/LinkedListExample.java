package com.test;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {

		LinkedList<Object> list=new LinkedList<Object>();
		list.add(10);
		list.add("hii");
		list.add("hii");
		list.add(null);
		list.add(null);
		list.add(30);
		list.add(40);
		// check wheather the object is present or not
		if(list.contains("hii"))
			System.out.println("present");
		else
			System.out.println("not present");
		// fetching the element one by one
		for(Object obj:list)
		{
			System.out.println(obj);
		}
		list.remove("hii");
		System.out.println(list);
		System.out.println(list.indexOf(40));
		System.out.println(list.getFirst());
		System.out.println(list.getLast());
		System.out.println(list.size());
		list.addFirst(10);
		list.addLast(90);
		System.out.println(list.getFirst());
		System.out.println(list.getLast());
		System.out.println(list);
	}

}
