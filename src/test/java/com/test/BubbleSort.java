package com.test;

import java.util.Arrays;
import java.util.Collections;

public class BubbleSort {

	public static void main(String[] args) {

		int [] a= {5,2,1,3};
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
       System.out.println("First Minimum number is "+a[0]);
       System.out.println("The Second Minimum Number is "+a[1]);
       System.out.println(Arrays.toString(a));
	}

}
