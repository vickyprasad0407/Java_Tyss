package com.test;

public class ReverseString {

	public static void main(String[] args) {

		String s="TestYantra";
		/*StringBuffer sb=new StringBuffer(s);
		System.out.println(sb.reverse());*/
		
		/*String rev="";
		for (int i = 0; i <s.length(); i++) {
			char ch=s.charAt(i);
			rev=ch+rev;
		}
		System.out.println(rev);*/
		
		/*int j=s.length()-1;
		int i=0;
        char [] ch=s.toCharArray();
		while(i<j)
		{
			char temp=ch[i];
			ch[i]=ch[j];
			ch[j]=temp;
			i++;
			j--;
			
		}
		String st=new String(ch);
		System.out.println(st);
		*/
		
		/*char st []=s.toCharArray();
		for(int i=st.length-1;i>=0;i--)
		{
			System.out.print(st[i]);
		}*/
		

		char [] ch=s.toCharArray();
		int count=0;
		for (char c : ch) {
			count++;
		}
		for(int i=count-1;i>=0;i--)
		{
			System.out.print(ch[i]);
		}
	}

}
