package OtherPrograms;

public class FindDuplicates 
{
	public static void main(String[] args) 
	{
		String a[]= {"java","python","C","C++","java"};
		
		boolean flag=false;
		for(int i=0 ;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					System.out.println("Duplicate element is:"+a[i]);
					flag = true;
				}
			}
		}
		if(flag==false)
		{
			System.out.println("No Duplicate Element Is present");
		}

	}
}
