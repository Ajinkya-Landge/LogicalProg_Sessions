package OtherPrograms;

public class MissingNumberInArray 
{
	 public static void main(String[] args) 
     {
	     int[]a= {1,2,3,4,6};
	     int Exp=a.length+1;
	     int TotalSum=Exp*(Exp+1)/2;
	     int sum=0;
	     
	     for(int i=0;i<a.length;i++)
	     {
	    	 sum=(sum+a[i]);
	     }
	     System.out.println("Missing Number is  "+(TotalSum-sum));
	 }
}
