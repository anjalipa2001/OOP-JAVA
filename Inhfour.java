import java.util.Scanner;
class Publisher
{
    String publisher;
    Publisher(String publisher)
	{
        this.publisher=publisher;
    }
}
class Book extends Publisher
{
    String book;
    Book(String publisher,String book)
	{
        super(publisher);
        this.book=book;

    }
}
class Literature extends Book
{
    Literature(String publisher, String book)
	{
        super(publisher, book);
    }
    void display()
	{
        System.out.println("BOOK NAME :"+book);
        System.out.println("   PUBLISHER NAME :"+publisher);
    }
}
class Fiction extends Book
{
    Fiction(String publisher, String book)
	{
        super(publisher, book);
    }
    void display()
	{
		System.out.println("BOOK NAME :"+book);
        System.out.println("   PUBLISHER NAME :"+publisher);
	}
}
public class Inhfour
{
    public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
        System.out.println("\nEnter the No. of Literature Books");
        int n1=s.nextInt();
        Literature ar1[]=new Literature[n1];
        System.out.println("\n Enter the Literature Book Details\n");
        for(int i =0;i<n1;i++)
        {
            System.out.println("\n BOOK "+(i+1)+"\n");
            System.out.print(" Book Name: ");
            String book =s.next();
            System.out.print("Publisher Name: ");
            String publisher =s.next();
        
            ar1[i]=new Literature(book,publisher);
        }
        System.out.println("\nEnter the No. of Fiction Books");
        int n2 = s.nextInt();
        Fiction ar2[]=new Fiction[n2];
        System.out.println("\n Enter the Fiction Book Details\n");
        for(int i =0;i<n2;i++)
        {
            System.out.println("\n BOOK "+(i+1)+"\n");
            System.out.print(" Book Name : ");
            String book =s.next();
            System.out.print(" Publisher Name : ");
            String publisher =s.next();
        
            ar2[i]=new Fiction(book,publisher);
        }
        
		System.out.println("\n *************************************************\n");
        System.out.println("\n LITERATURE BOOKS INFORMATIONS");
        for(int i=0;i<n1;i++)
		{
            
            System.out.print("\n"+(i+1)+").");
            ar1[i].display();
            
        }
        System.out.println("\nFICTION BOOKS INFORMATIONS");
        for(int i=0;i<n2;i++)
		{
            System.out.print("\n"+(i+1)+").");
            ar2[i].display();
            
        }
  
     }
    
    }
