package com.test;

public class Pattern12 {

	public static void main(String[] args) {

//		5 4 3 2 1 
//		  5 4 3 2 
//		   5 4 3 
//		    5 4 
//		     5
	/*	int n=5;
		for (int i = 1; i <=n; i++) {
			int k=5;
			for (int j = 1; j <=i; j++) {
				System.out.print(" ");
			}
			for (int j = i; j <=n; j++) {
				System.out.print(k--+" ");
			}
			System.out.println();
		}
		*/
//		1
//		22
//		111
//		2222
//		11111
		/*
		int n=5;
		for(int i=1;i<=n;i++)
		{
			for (int j = 1; j <=i; j++) {
               if(i%2==0)
            	   System.out.print("2");
               else
            	   System.out.print("1");
			}
			System.out.println();
		}
		*/
//		A 
//		B C 
//		D E F 
//		G H I J 
//		K L M N O
		/*int n=5;
		char ch='A';
		for (int i = 1; i <=n; i++) {
			for (int j = 1; j <=i; j++) {
				System.out.print(ch+" ");
				ch++;
			}
			System.out.println();
		}
		*/
//		1 
//		2 3 
//		4 5 6 
//		7 8 9 10
		/*int n=4;
		int st=1;
		for (int i = 1; i <=n; i++) {
			for (int j = 1; j <=i; j++) {
				System.out.print(st+" ");
				st++;
			}
			System.out.println();
		}
		*/
//		1 
//		2 3 
//		4 5 6 
//		7 8 9 1 
//		2 3 4 5 6
		/*int n=5;
		int st=1;
		for (int i = 1; i <=n; i++) {
			for (int j = 1; j <=i; j++) {
				System.out.print(st+" ");
				if(st<9)
				   st++;
				else
					st=1;
			}
			System.out.println();
		}
       */
//        1 
//      1 2 1 
//    1 2 3 2 1 
//  1 2 3 4 3 2 1 
//1 2 3 4 5 4 3 2 1
		int n=5;
		int st=1;
		for (int i = 1; i <=n; i++) {
			for (int j = 1; j <=n-i; j++) {
				System.out.print("  ");
			}
			int x=1;
			for (int j = 1; j <=st; j++) {
				System.out.print(x+" ");
				if(j<i)
					x++;
				else
					x--;
					
			}
			st=st+2;
			System.out.println();
		}

	}

}
