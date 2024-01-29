package OtherPrograms;

import java.util.Scanner;

public class ASCIIvalue 
{
	public static void main(String[] args) 
	{
		char ch;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Character");
		ch=sc.next().charAt(0);
		sc.close();
		
		int a=ch;
		System.out.println(a+": Is the ASCII Value Of Given Character");

	}
}
