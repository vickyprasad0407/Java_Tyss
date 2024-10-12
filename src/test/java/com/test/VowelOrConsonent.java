package com.test;

public class VowelOrConsonent {

	/*public static void vowel_or_Consonent(char ch) {

		String s="aeiouAEIOU";
        if(s.indexOf(ch)!=-1)
        	System.out.println("vowel");
        else
        	System.out.println("consonent");
	}*/
	public static void vowel_or_Consonent(char ch) {
           if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' ||ch=='O' || ch=='U')
        	   System.out.println("vowel");
           else
        	   System.out.println("consonent");
			}
   public static void main(String[] args) {
	   vowel_or_Consonent('e');
}	

}
