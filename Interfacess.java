import java.util.Scanner;
interface Shape 
{
    double area();
    double perimeter();
}

class Circle implements Shape 
{
    private double radius;

    Circle(double radius) 
	{
        this.radius = radius;
    }

    @Override
    public double area()
	{
        return Math.PI * radius * radius;
    }

    @Override
    public double perimeter() 
	{
        return 2 * Math.PI * radius;
    }
}


class Rectangle implements Shape
 {
    private double length;
    private double width;

    Rectangle(double length, double width) 
	{
        this.length = length;
        this.width = width;
    }

    @Override
    public double area() 
	{
        return length * width;
    }

    @Override
    public double perimeter() 
	{
        return 2 * (length + width);
    }
}


public class Interfacess 
{
    public static void main(String[] args) 
	{
        Scanner s=new Scanner(System.in);
		int ch;
		do
		{
			System.out.println("\n \n 	MENU ");
			System.out.println("\n 1.CIRCLE ");
			System.out.println("\n 2.RECTANGLE ");
			System.out.println("\n 3.EXIT ");
			System.out.print("\n ENTER YOUR CHOICE TO FIND THE AREA AND PERIMETER ");
			ch=s.nextInt();
			
			switch(ch)
			{
				case 1:System.out.println("\n AREA AND THE PERIMETER OF A CIRCLE ");
			           System.out.print("\n Enter the Radius of the circle : ");
					   double radius=s.nextDouble();
					   Circle circle=new Circle(radius);
			           System.out.print("\n AREA OF THE CIRCLE IS "+circle.area());
			           System.out.print("\n PERIMETER OF THE CIRCLE IS "+circle.perimeter());
					   break;
			    case 2:System.out.println("\n AREA AND THE PERIMETER OF A RECTANGLE");
			           System.out.print("\n Enter the Length of the Rectangle : ");
					   double length=s.nextDouble();
					   System.out.print("\n Enter the Breadth of the Rectangle : ");
					   double width=s.nextDouble();
					   Rectangle rectangle=new Rectangle(length,width);
			           System.out.print("\n AREA OF THE RECTANGLE IS "+rectangle.area()+"\n");
			           System.out.print("\n PERIMETER OF THE RECTANGLE IS "+rectangle.perimeter());
					   break;
			    case 3:System.out.println("EXITING THE PROGRAM...");
				       break;
			    default:System.out.println("INVALID CHOICE...PLEASE TRY AGAIN");
			}
		}
		while(ch!=3);
    }
}