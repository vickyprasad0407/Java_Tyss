// first  minimum and first maximum number in array without bubble sorting
package com.test;

public class ArrayComparision {

	public static void main(String[] args) {

		int [] ar= {5,2,1,3};
		int min=ar[0];
		for (int i = 1; i < ar.length; i++) {
			if(ar[i]<min)
				min=ar[i];
		}
		System.out.println("the first minimum no is "+min);
		int max=ar[0];
		for (int i = 1; i < ar.length; i++) {
			if(ar[i]>max)
				max=ar[i];
		}
		System.out.println("the first maximum no is "+max);
	}

}
