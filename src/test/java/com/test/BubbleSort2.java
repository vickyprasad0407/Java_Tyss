package com.test;

public class BubbleSort2 {

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
        int sum=0;
        int count=0;
        for(int i=a.length-1;i>=0;i--)
        {
        	sum=sum+a[i];
        	count++;
        	if(count==3)
        		break;
        }
        System.out.println("The sum of first 3 biggest is "+sum);
        
        int pro=1;
        int count1=3;
        for (int i = 0; i < count1; i++) {
			pro=pro*a[i];
		}
        System.out.println("the product of first 3 smallest no. is "+pro);
        
        int proMax=1;
        count=0;
        for (int i = a.length-1; i >=0; i--) {
			proMax=proMax*a[i];
			count++;
			if(count==3)
				break;
		}
        System.out.println("the product of first three maximum no is "+proMax);
	}

}
