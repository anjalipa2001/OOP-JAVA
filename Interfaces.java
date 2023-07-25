import java.util.Scanner;
interface Prototype
{
  double area();
  double perimeter();
}
class Circle implements Prototype
{
  double r;
  Circle(double r)
  {
    this.r=r;
  }
  @Override
  public double area()
  {
    return Math.PI * r * r;
  }
  @Override
  public double perimeter()
  {
    return 2*Math.PI*r;
  }
 }
 class Rectangle implements Prototype
{
  double l,b;
  Rectangle(double l,double b)
  {
    this.l=l;
	this.b=b;
  }
  @Override
  public double area()
  {
    return l*b;
  }
  @Override
  public double perimeter()
  {
    return 2*(l+b);
  }
 }
class Interfaces
{
 public static void main(String[] args)
 {
   int ch;
   Scanner s=new Scanner(System.in);
   do
   {
   System.out.print("\nMENU ");
   System.out.print("\n 1.CIRCLE \n 2.RECTANGLE \n 3.EXIT");
   System.out.print("\nEnter the Choice : ");
   ch= s.nextInt();
   switch(ch)
   {
     case 1:System.out.println("\nAREA AND PERIMETER OF CIRCLE ");
	        System.out.print("\nEnter the radius : ");
			double r=s.nextDouble();
			Circle circle=new Circle(r);
			System.out.print("\nAREA = "+circle.area());
            System.out.print("\nPERIMETER = "+circle.perimeter());
			break;
	 case 2:System.out.print("\nAREA AND PERIMETER OF RECTANGLE ");
	        System.out.print("\nEnter the length : ");
			double l=s.nextDouble();
			System.out.print("\nEnter the breadth : ");
			double b=s.nextDouble();
			Rectangle rectangle=new Rectangle(l,b);
			System.out.print("\nAREA = "+rectangle.area());
            System.out.print("\nPERIMETER = "+rectangle.perimeter());
			break;
	 case 3:System.out.print("\nEXITING...!!!");
	        break;
	 default:System.out.print("\nINVALID CHOICE PLEASE TRY AGAIN!!!");
	}
	}
	while(ch!=3);
  }
}

 