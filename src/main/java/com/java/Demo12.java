package com.java;

public class Demo12 {

	public static void main(String[] args) {

		int [] arr= {6,10,12,16};
		for (int i = 0; i < arr.length-1; i++) {
			if(arr[i+1]==arr[i]+2)
			{
				continue;
			}
			else
				System.out.println(arr[i]+2);
		}
	}

}
