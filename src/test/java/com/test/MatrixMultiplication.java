package com.test;

import java.util.Arrays;

public class MatrixMultiplication {

	public static void main(String[] args) {

		int [][] a= {{1,2,3},{4,5,6}};
		int [][] b= {{9,8},{6,5},{3,2}};
		int [][] c=new int [a.length][b[0].length];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b[i].length; j++) {
				c[i][j]=0;
				for (int k = 0; k < b.length; k++) {
					c[i][j]=c[i][j]+a[i][k]*b[k][j];
				}
			}
		}
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c[i].length; j++) {
				System.out.print(c[i][j]+"\t");
			}
			System.out.println();
		}
	}

}
