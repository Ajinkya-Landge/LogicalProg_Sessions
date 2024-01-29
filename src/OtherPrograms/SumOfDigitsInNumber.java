package OtherPrograms;

import java.util.Scanner;

public class SumOfDigitsInNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Number");
		int num=sc.nextInt();
		sc.close();
		int sum=0;
		
		while(num>0)
		{
			sum=sum+num%10;
			num=num/10;
		}
		System.out.println(sum+": is the SUm of digits in given Number");

	}
}
