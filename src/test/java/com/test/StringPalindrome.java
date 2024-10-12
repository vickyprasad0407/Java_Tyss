package com.test;

public class StringPalindrome {

	public static void main(String[] args) {

		String s="malayalam";
		/*int i=0;
		int j=s.length()-1;
		char [] ch=s.toCharArray();
		boolean flag=false;
		while(i<j)
		{
			if(ch[i++]==ch[j--])
				flag=true;
		}
		if(flag)
			System.out.println("palindrome");
		else
			System.out.println("not a palindrome");
			*/
		String rev="";
		for (int i = 0; i < s.length(); i++) {
			rev=s.charAt(i)+rev;
		}
        if(rev.equals(s))
        	System.out.println("palindrome");
        else
        	System.out.println("not a palindrome");
	}

}
