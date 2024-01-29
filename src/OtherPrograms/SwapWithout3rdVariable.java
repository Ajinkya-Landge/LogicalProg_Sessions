package OtherPrograms;

public class SwapWithout3rdVariable 
{
	public static void main(String[] args) 
	{
		int a=10 ,b=20;
		System.out.println("Values Before Swapping");
		System.out.println("a="+a);
		System.out.println("b="+b);
		
	/*	a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("Values After Swapping");
		System.out.println("a="+a);
		System.out.println("b="+b); 
		
		
		a=a*b;
		b=a/b;
		a=a/b;
		System.out.println("Values After Swapping");
		System.out.println("a="+a);
		System.out.println("b="+b); */
		
		
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println("Values After Swapping");
		System.out.println("a="+a);
		System.out.println("b="+b);
		
		
		
		

	}
}
