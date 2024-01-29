package OtherPrograms;

import java.util.Scanner;

public class CountOfDigitsInNumber 
{
	public static void main(String[] args) 
	{
		Scanner Sc=new Scanner(System.in);
		System.out.println("Enter Any Number");
		int num=Sc.nextInt();
		Sc.close();
		int count=0;
		
		while(num>0)
		{
			count=count+1;
			num=num/10;
			
		}
		System.out.println(count+":Is Count of Digits in given Number");

	}
	
}
