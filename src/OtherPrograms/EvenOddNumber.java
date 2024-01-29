package OtherPrograms;

import java.util.Scanner;

public class EvenOddNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Number");
		int num=sc.nextInt();
		sc.close();
		if(num%2==0)
		{
			System.out.println(num+":Is even Number");
		}
		else
		{
			System.out.println(num+":Is Odd Number");
		}

	}
}
