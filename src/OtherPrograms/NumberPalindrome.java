package OtherPrograms;

import java.util.Scanner;

public class NumberPalindrome 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Number");
		int num=sc.nextInt();
		sc.close();
		int rem,rev=0;
		int temp=num;
		
		while(temp!=0)
		{
			rem=temp%10;
			rev=rev*10+rem;
			temp=temp/10;
		}
		System.out.println(rev+":Is Reverse Of Given Number");
		if(num==rev)
		{
			System.out.println(num+":Is Palindrome Number");
		}
		else
		{
			System.out.println(num+":Is Not PalindromeNumber");
		}

	}
}
