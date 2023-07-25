import java.util.Scanner;
class Publisher
{
  String pname;
  Publisher(String pname)
  {
    this.pname=pname;
  }
}
class Book extends Publisher
{
  String bname;
  Book(String bname,String pname)
  {
	super(pname);
    this.bname=bname;
  }
 }
class Literature extends Book
{ 
   Literature(String bname,String pname)
   {
     super(bname,pname);
   }
   void display()
   {
     System.out.print("\nBOOK NAME : "+bname);
	 System.out.print("\nPUBLISHER NAME : "+pname);
	}
}
class Fiction extends Book
{ 
   Fiction(String bname,String pname)
   {
     super(bname,pname);
   }
   void display()
   {
     System.out.print("\nBOOK NAME : "+bname);
	 System.out.print("\nPUBLISHER NAME : "+pname);
	}
}
public class Publish
{
public static void main(String[] args)
{
  Scanner s=new Scanner(System.in);
  System.out.print("Enter the number of literature bname to add : ");
  int n=s.nextInt();
  Literature ar1[]=new Literature[n];
  System.out.print("\nEnter the details");
  for(int i=0;i<n;i++)
  {
    System.out.print("\nBOOK "+(i+1));
	System.out.print("\nEnter the bname name : ");
	String bname=s.next();
	System.out.print("\nEnter the pname name : ");
	String pname=s.next();
	ar1[i]=new Literature(bname,pname);
  }
  System.out.print("\nEnter the number of fiction bname to add : ");
  int m=s.nextInt();
  Fiction ar2[]=new Fiction[m];
  System.out.print("\nEnter the details");
  for(int i=0;i<m;i++)
  {
    System.out.print("\nBOOK "+(i+1));
	System.out.print("\nEnter the bname name : ");
	String bname=s.next();
	System.out.print("\nEnter the pname name : ");
	String pname=s.next();
	ar2[i]=new Fiction(bname,pname);
  }
  System.out.print("\n*********************************************\nDISPLAY LITERATURE BOOK DETAILS ");
  for(int i=0;i<n;i++)
  {
    System.out.print("\n"+(i+1)+")");
    ar1[i].display();
  }
  System.out.print("\n*********************************************\nDISPLAY LITERATURE BOOK DETAILS ");
  for(int i=0;i<m;i++)
  {
    System.out.print("\n"+(i+1)+")");
    ar2[i].display();
  }
  }
 }
	
  
  
	 
 