package OtherPrograms;

public class SmallestNumberInArray 
{
	public static void main(String[] args) 
	{
		
		int[]a= {4,3,56,6,7,2,3};
			  int small=a[0];
			  for(int i=0;i<a.length;i++)
			  {
				  if(small>a[i])
				  {
					  small=a[i];
				  }
			  }
			  System.out.println("Smallest Element in array is  "+small);

	}
}
