package OtherPrograms;

import java.util.Arrays;

public class ArraySort_BubbleSort 
{
	public static void main(String[] args) 
	{
		int a[]= {4,2,1,5,3};
		
		System.out.println("Array before Sorting "+Arrays.toString(a));
		int n=a.length;
		
		for(int i=0 ;i<n-1 ;i++)
		{
			for(int j=0 ;j<n-1;j++)
			{
				if(a[j]>a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		
		System.out.println("Array After Sorting "+Arrays.toString(a));

	}
}
