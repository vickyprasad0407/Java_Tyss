// print the index
package com.test;

import java.util.LinkedHashSet;

public class PositionOfEachNumbersInArray {

	public static void main(String[] args) {

		int [] a= {2,3,2,1,0,3};
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]+" position is "+(i+1));
		}
		LinkedHashSet<Integer> set=new LinkedHashSet<Integer>();
		for (int i = 0; i < a.length; i++) {
			set.add(a[i]);
		}
		for (Integer integer : set) {
			for (int i = 0; i < a.length; i++) {
				if(integer==a[i])
				{
					System.out.println(integer+"...."+(i+1));
					break;
				}
			}
		}
		
	}

}
