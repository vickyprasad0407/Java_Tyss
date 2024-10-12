package com.test;

public class Demo3 {

	public static void main(String[] args) {
		int [][] a= {{1,1,1},{2,2,2},{3,3,3}};
		int [][] b= {{1,1,1},{2,2,2},{3,3,3}};
		int [][] c=new int[a.length][a[0].length];
		int ec=0,oc=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[0].length;j++)
			{
                	if(a[i][j]%2==0)
                		ec++;
                	else
                		oc++;
			}
		
		}
		
		System.out.println(ec+" "+oc);

	}

}
