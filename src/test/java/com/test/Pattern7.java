/*
   *
  * *
 * * *
* * * *
 * * *
  * *
   *   
 */
package com.test;

public class Pattern7 {

	public static void main(String[] args) {

		int n=7,sp=n/2,st=1;
		for (int i = 1; i<=n; i++) {
			for (int j = 1; j<=sp; j++) {
				System.out.print(" ");
			}
			for (int j = i; j<=n; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}


	}

}
