package NumberPatterns;

public class Np7 
{
	public static void main(String[] args) 
	{
		for(int i=1 ;i<=4 ;i++)
		{
			int no=i;
			for(int j=1 ;j<=i;j++)
			{
				System.out.print(no+" ");
				no=no+4-j;
			}
			System.out.println();
		}
	}
}
