package com.java;

public class DemoNumber {

	public static void main(String[] args) {
		int n=2340;
		String no=n+"";
		int i=0;
		int j=no.length()-1;
		int sum=0;
		while(j>=i)
		{
			int x=0,y=0;
			if(i!=j)
			{
			 x=Integer.parseInt(no.charAt(i)+"");
			 y=Integer.parseInt(no.charAt(j)+"");
			 sum=sum+x+y;
			}
			else
			{
				x=Integer.parseInt(no.charAt(i)+"");
				sum=sum+x;	
			}
			int p=sum;
			if(p>9)
			{
				int a=sum%10;
				int b=p/10;
				sum=a+b;
				p=p/10;
			}	
			i++;
			j--;
		}
		System.out.println(sum);
			
	}
 
}
