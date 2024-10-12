package com.java;

import java.util.Arrays;
import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		
		int [][] a= {{1,1,1},{2,2,2},{3,3,3}};
		int [][] b= {{1,1,1},{2,2,2},{3,3,3}};
		int [][] c=new int[a.length][a[0].length];
		
		for(int i=0;i<a.length;i++)
		{
			int sum=0;
			for(int j=0;j<a[0].length;j++)
			{
				sum=sum+a[i][j]*b[j][i];
			    
			}
			for(int j=0;j<a[0].length;j++)
			{
				c[i][j]=sum;
			    
			}

		   
		}
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[0].length;j++)
			{
				System.out.print(c[i][j]+" ");
			}
		}

		
		
	
	}
	
	}


