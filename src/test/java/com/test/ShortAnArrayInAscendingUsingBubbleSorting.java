package com.test;

public class ShortAnArrayInAscendingUsingBubbleSorting {

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
//		for(int i=0;i<a.length;i++)
//		{
//			System.out.println(a[i]);
//		}
	}

}
