package com.java;

import java.util.Arrays;
import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		int [] arr= {10,20,30,40,50};
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the index");
		int in=sc.nextInt();
		int first=0;
		int last=arr.length-1;
		int [] b=new int[in+1];
		int d=0;
		for (int i = 0; i < b.length; i++) {
			b[i]=arr[i];
		}
		while(last>=first)
		{
			
			if(in<arr.length-1)
			{
				arr[first++]=arr[in+1];
				in++;
			}
			else
				arr[first++]=b[d++];
		}
		System.out.println(Arrays.toString(arr));

	}

}
