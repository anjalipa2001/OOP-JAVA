import java.util.Scanner;
public class Areas
{
  public static void main(String[] args)
  {
    Scanner s=new Scanner(System.in);
	System.out.println("CHOOSE A SHAPE TO CALCULATE THE AREA");
	System.out.println("1. SQUARE");
	System.out.println("2. RECTANGLE");
	System.out.println("3. CIRCLE");
	System.out.println("4. EXIT");
	int ch=s.nextInt();
	
	switch(ch)
	{
	  case 1:System.out.println("Enter the side of the square : ");
	         int side=s.nextInt();
			 System.out.println("Area of the square is "+calc(side));
			 break;
	  case 2:System.out.println("Enter the length of the rectangle : ");
	         int length=s.nextInt();
			 System.out.println("Enter the breadth of the rectangle : ");
			 int breadth=s.nextInt();
			 System.out.println("Area of the rectangle is "+calc(length,breadth));
			 break;
	 case 3 :System.out.println("Enter the radius of the circle : ");
	         double radius=s.nextDouble();
			 System.out.println("Area of the circle is "+calc(radius));
			 break;
	 case 4 :
	         break;
	 default:System.out.println("INVALID CHOICE");
			 break;
	}
  }		 
    public static int calc(int side)
	{
	  return side*side;
	}
	public static int calc(int length,int breadth)
	{
	  return length*breadth;
	}
	public static double calc(double radius)
	{
		return Math.PI * Math.pow(radius, 2);
	}
}
	
	