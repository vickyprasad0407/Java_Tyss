// use o's at last and 1 at the first
//[1 1 0 0 0]
package com.test;

import java.util.Arrays;

public class Append0sAtLast {

	public static void main(String[] args) {

		int [] a= {1,0,0,1,0};
		int [] b=new int[a.length];
		int m=0;
		int n=a.length-1;
		for (int i = 0; i < a.length; i++) {
			if(a[i]==1)
			{
				b[m]=a[i];
				m++;
			}
			else
			{
				b [n]=a[i];
				n--;
			}
		}
		System.out.println(Arrays.toString(b));
	}

}
