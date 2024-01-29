package OtherPrograms;

import java.util.Scanner;

public class CountOfEvenOddDigitsInNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Number");
		int num=sc.nextInt();
		sc.close();
		int rem;
		int Ec=0;
		int Oc=0;
		
		while(num>0)
		{
			rem=num%10;
			if(rem%2==0)
			{
				Ec++;
			}
			else
			{
				Oc++;
			}
			num=num/10;
			
		}
		System.out.println(Ec+":Is Count of Even Digits In Number");
		System.out.println(Oc+":Is Count of Odd Digits In Number");

	}

}
