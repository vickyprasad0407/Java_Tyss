package com.test;

import java.util.HashSet;

public class OccuranceOfEachCharacter {

	public static void main(String[] args) {

		int [] a= {1,2,2,3,3,3,4,4,4,4};
		
		HashSet<Integer> hs=new HashSet<Integer>();
		for (int i = 0; i < a.length; i++) {
			hs.add(a[i]);
		}
		for (Integer integer : hs) {
			int count=0;
			for (int i = 0; i < a.length; i++) {
				if(integer==a[i])
					count++;
			}
			if(count>1)
				System.out.println(integer+".is repeating...."+count+"...time");//to print duplicates
			//System.out.println(integer+"------>"+count);
		}
	}

}
