package OtherPrograms;

public class EvenOddList 
{
	public static void main(String[] args) 
	{
		System.out.println("--List of Even Numbers--");
		for(int num=1 ;num<=100;num++)
		{
			if(num%2==0)
			{
				System.out.print(num+" ");
			}
		}
		System.out.println();
		System.out.println("--List of Odd Numbers--");
		for(int num=1 ;num<=100;num++)
		{
			if(num%2!=0)
			{
				System.out.print(num+" ");
			}
		}

	}
}
