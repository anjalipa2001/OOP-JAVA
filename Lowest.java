import java.util.Scanner;
class Product
{
  int pcode;
  String pname;
  double price;
  public Product(int pcode,String pname,double price)
  {
    this.pcode=pcode;
	this.pname=pname;
	this.price=price;
  }
 }
 class Lowest
 {
  public static void main(String[] args)
  {
    Scanner s=new Scanner(System.in);
	Product[] products=new Product[3];
	for(int i=0;i<3;i++)
	{
	  System.out.println("\nEnter the product "+(i+1)+" details");
	  System.out.print("\nEnter the product code : ");
	  int pcode=s.nextInt();
	  System.out.print("Enter the product name : ");
	  String pname=s.next();
	  System.out.print("Enter the product price : ");
	  double price=s.nextDouble();
	  
	  products[i]= new Product(pcode,pname,price);
	}
	Product lowest=products[0];
	for(int i=0;i<3;i++)
	{
	  if(products[i].price<lowest.price)
	  {
	    lowest=products[i];
	  }
	}
	System.out.println("\nPRODUCT WITH THE LOWEST PRICE ");
	System.out.println("\nProduct code : "+lowest.pcode);
	System.out.println("Product name : "+lowest.pname);
	System.out.println("Product price : "+lowest.price);
	}
}
	  
	  
	  
	  
	