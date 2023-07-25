import java.util.Scanner;
public class Searcharray
{
 public static void main(String[] args)
{
  
  Scanner s=new Scanner(System.in);
  System.out.println("Enter the number of arrays :");
  int n=s.nextInt();
  int[] arr=new int[n];
  System.out.println("Enter the elements into the array :");
  for(int i=0;i<n;i++)
  {
    arr[i]=s.nextInt();
  }
  System.out.println("Array elements are :");
  for(int i=0;i<n;i++)
  {
    System.out.println(arr[i]);
  }
 
   int x=0,find=0;
   System.out.println("Enter the number to be search in an array:");
   x=s.nextInt();
   for(int i=0;i<n;i++)
   {
     if(arr[i]==x)
	 {
	   find=1;
	   break;
	 }
	 else
	 {
	   find=0;
	  }
	}
	if(find==1)
	{
	  System.out.println("Element found");
	}
	else
	{
	  System.out.println("Element not found!!");
	}
}

}
  