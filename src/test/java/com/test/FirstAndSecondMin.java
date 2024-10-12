package com.test;

public class FirstAndSecondMin {

	public static void main(String[] args) {

		int [] arr= {3,1,2};
		int fmin=arr[0];
		int smin=arr[0];
        for (int i = 1; i < arr.length; i++) {
		    if(arr[i]<fmin)
		    {
		    	if(arr[i]!=fmin)
		    	{
		    		smin=fmin;
		    	}
		    	fmin=arr[i];
		    }
		    else if(fmin==smin|| smin>arr[i])
		    {
		    	smin=arr[i];
		    }
        }
        System.out.println(fmin+"..."+smin);
	}

}
