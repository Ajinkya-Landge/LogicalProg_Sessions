package OtherPrograms;

public class RemoveWhiteSpaces 
{
	public static void main(String[] args)
	{
		System.out.println("Before Removing white Spaces");
		String str="java   is  a pro  gramming la nguag e";
		System.out.println(str);
		
		System.out.println();
		System.out.println("After Removing white Spaces");
		str=str.replaceAll("\\s", "");
		System.out.println(str);

	}
}
