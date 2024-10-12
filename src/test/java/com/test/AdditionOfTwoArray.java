//addition of two dissimilar array
package com.test;

import java.util.Arrays;

public class AdditionOfTwoArray {

	public static void main(String[] args) {

		int [] a= {4,2,3,5,3};
		int [] b= {2,4,1,7};
        int length=0;
		if(a.length<b.length)
			length=b.length;
		else
			length=a.length;
		for (int i = 0; i <length; i++) {
			try {
				System.out.print(a[i]+b[i]+" ");
			} catch (ArrayIndexOutOfBoundsException e) {
                if(a.length<b.length)
                	System.out.print(b[i]+" ");
                else
                	System.out.print(a[i]+" ");
			}
		}		
	}

}
