package com.java;

public class MirrorImage {

	public static void main(String[] args) {

		String s="I Love my Country";
		char[] ch=s.toCharArray();
		String rev="";
		for (int i=ch.length-1;i>=0 ;i--) {
			if(i==1 && ch[i]==' ')
				rev=rev;
			else if(i==ch.length-2 && ch[i]!=' ')
				rev=rev+" "+ch[i];
				else
					rev=rev+ch[i];
				
		}
		System.out.println(rev);
	}

}
