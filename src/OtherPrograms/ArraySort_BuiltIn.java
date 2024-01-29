package OtherPrograms;

import java.util.Arrays;
import java.util.Collections;

public class ArraySort_BuiltIn 
{
	public static void main(String[] args) 
	{
	/*	int a[]= {1,3,2,5,4,6};
		System.out.println("Before Sorting");
		System.out.println(Arrays.toString(a));
		
		System.out.println();
		System.out.println("After Sorting");
		
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));  
		
		Arrays.parallelSort(a);
		System.out.println(Arrays.toString(a));   */
		
		System.out.println("before Sorting");
		Integer a[]= {1,3,2,5,4,6};
		System.out.println(Arrays.toString(a));
		
		
		System.out.println();
		Arrays.sort(a,Collections.reverseOrder());
		System.out.println(Arrays.toString(a));

	}
}
