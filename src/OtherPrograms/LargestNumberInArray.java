package OtherPrograms;

public class LargestNumberInArray 
{
	public static void main(String[] args) 
	{
		
			   int[]a= {4,5,32,76,53,2};
			   int large=a[0];
			   for(int i=0;i<a.length;i++)
			   {
				   if(large<a[i])
				   {
					   large=a[i];
				   }
			   }
			   System.out.println("Largest Element in Array is "+large);
			 
		


	}
}
