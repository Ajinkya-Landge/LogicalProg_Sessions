package OtherPrograms;

import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicate 
{

	public static void main(String[] args) 
	{
		int a[]= {1,2,3,4,4,5,6,7,2,3};
		System.out.println("Array before Removing Duplicate");
		System.out.println(Arrays.toString(a));
		
		HashSet<Integer> hs=new HashSet<>();
		
		for(int i=0;i<a.length;i++)
		{
			hs.add(a[i]);
		}
		System.out.println();
		System.out.println("Array After Removing Duplicate");
		for(int no:hs)
		{
			System.out.print(no+" ");
		}
		
		
	

	}
}
