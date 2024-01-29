package OtherPrograms;

public class RemoveSpCharacter 
{
	public static void main(String[] args) 
	{
		System.out.println("Before Removing Special characters");
		String str="$@#@$AJI$@$NKYA#!!$@153";
		System.out.println(str);
		
		System.out.println();
		System.out.println("After Removing Special characters");
		str=str.replaceAll("[^a-zA-z0-9]", "");
		System.out.println(str);

	}
}
