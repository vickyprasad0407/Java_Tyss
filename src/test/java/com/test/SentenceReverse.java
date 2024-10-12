// reverse a sentence
package com.test;

import java.util.Arrays;

public class SentenceReverse {

	public static void main(String[] args) {

		String s="Welecome to Bengaluru bengaluru";
		
		String st=s.toLowerCase();
		String [] str=st.split(" ");
		/*for(int i=str.length-1;i>=0;i--)
		{
			System.out.print(str[i]+" ");
		}*/
		
		/*String rev=" ";
		for (String string : str) {
			rev=string+" "+rev;
		}
		System.out.println(rev);
		*/
		
		/*for (int i = str.length-1; i >=0; i--) {
			System.out.print(str[i]+" ");
		}
		*/
		
		int i=0;
		int j=str.length-1;
		while(i<j)
		{
			String temp=str[i];
			str[i++]=str[j];
			str[j--]=temp;
		}
		System.out.println(Arrays.toString(str));
	}

}
