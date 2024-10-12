package com.test;

public class SegragateAlphabetsNosAndSpecialCharacter {

	public static void main(String[] args) {

		String s="a3f2$v!5^";
		String chracter="";
		String numerical="";
		String special="";
		/*for (int i = 0; i < s.length(); i++) {
			int ch=s.charAt(i);
			if(ch>='A' && ch<='Z' || ch>='a' && ch<='z')
                  chracter=chracter+(char)ch;
			else if(ch>='0' && ch<='9')
                 numerical=numerical+(char)ch;
			else
                  special=special+(char)ch;
		}
		System.out.println(chracter+"......"+numerical+"....."+special);
		*/
		for (int i = 0; i < s.length(); i++) {
			char ch=s.charAt(i);
			if(Character.isAlphabetic(ch))
				chracter=chracter+ch;
			else if(Character.isDigit(ch))
				numerical=numerical+ch;
			else
				special=special+ch;
		}
		System.out.println(chracter+"......"+numerical+"....."+special);
		
	}

}
