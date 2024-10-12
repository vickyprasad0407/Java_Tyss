package com.test;

public class Demo2 {

	public static void main(String[] args) {

		int [][] a= {{1,1,1},{2,2,2},{3,3,3}};
		int [][] b= {{1,1,1},{2,2,2},{3,3,3}};
		int [][] c=new int[a.length][a[0].length];
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[0].length;j++)
			{
                c[i][j]=a[i][j]+b[i][j];			    
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
