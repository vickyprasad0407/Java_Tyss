package com.test;

public class ReverseEachWordOfString {

	public static void main(String[] args) {

		String s="welcome to Goa Singham";
		String [] str=s.split(" ");
		for (int i = 0; i <str.length; i++) {
			String st=str[i];
			for (int j = st.length()-1; j >=0; j--) {
				System.out.print(st.charAt(j));
			}
			System.out.print(" ");
		}
		//System.out.println(new StringBuilder(s).reverse());
	}

}
