package OtherPrograms;

public class ReverseEachWordOfString 
{
	public static void main(String[] args) 
	{
		String s="Welcome to Java";
		System.out.println(s);
		
		String []words=s.split(" ");
		
		String ReverseString="";
		
		for(String w:words)
		{
			String ReverseWord="";
			for(int i=w.length()-1;i>=0;i--)
			{
				ReverseWord=ReverseWord+w.charAt(i);
			}
			ReverseString=ReverseString+ReverseWord+" ";
		}
		System.out.println(ReverseString);

	}
}
