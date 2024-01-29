package OtherPrograms;

public class PrimeNumberList
{
public static void main(String[] args) 
{
	System.out.println("--List of Prime number");
	for(int num=1 ;num<=100;num++)
	{
		int temp=0;
		for(int i=2 ;i<=num-1;i++)
		{
			if(num%i==0)
			{
				temp=temp+1;
			}
		}
		if(temp==0)
		{
			System.out.print(num+" ");
		}
	}
	System.out.println();
	System.out.println("--List of Non-Prime number");
	for(int num=1 ;num<=100;num++)
	{
		int temp=0;
		for(int i=2 ;i<=num-1;i++)
		{
			if(num%i==0)
			{
				temp=temp+1;
			}
		}
		if(temp!=0)
		{
			System.out.print(num+" ");
		}
	}
}

}
