package OtherPrograms;

public class CharacterOccurance 
{
	public static void main(String[] args)
	{
		String s= "java is a Programming language";
		
		int slength=s.length();
		System.out.println(slength+": Is Total Length");
		
		String s1=s.replaceAll("a", "");
		int flength=s1.length();
		System.out.println(flength+": Is Length after removing a");
		
		
		int Characterocc= slength-flength;
		System.out.println(Characterocc+": Is a length of character a occured in string");

	}
}
