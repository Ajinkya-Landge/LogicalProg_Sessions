package OtherPrograms;

import java.util.Scanner;

public class StringPalindrome 
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Any String");
		String str=sc.next();
		sc.close();
		String rev="";
		
		for(int i=str.length()-1 ;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		System.out.println(rev+":Is Reverse of Given String");
		if(str.equals(rev))
		{
			System.out.println(str+":Is Palindrome String");
		}
		else
		{
			System.out.println(str+":Is Not Palindrome String");
		}

	}
}
