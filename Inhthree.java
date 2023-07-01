

import java.util.Scanner;
class Person
{
  protected String name;
  protected String gender;
  protected String address;
  protected int age;
  public Person(String name,String gender,String address,int age)
  {
    this.name=name;
	this.gender=gender;
	this.address=address;
	this.age=age;
  }
}
  class Employee extends Person
  {
    protected int empid;
	protected String cmpname;
	protected String qual;
	protected double sal;
	public Employee(String name,String gender,String address,int age,int empid,String cmpname,String qual,double sal)
	{
      super(name,gender,address,age);
	  this.empid=empid;
	  this.cmpname=cmpname;
	  this.qual=qual;
	  this.sal=sal;
	}
}
class Teacher extends Employee
{
  protected int tchrid;
  protected String sub;
  protected String dpmt;
  public Teacher(String name,String gender,String address,int age,int empid,String cmpname,String qual,double sal,int tchrid,String sub,String dpmt)
  {
    super(name,gender,address,age,empid,cmpname,qual,sal);
    this.tchrid=tchrid;
	this.sub=sub;
	this.dpmt=dpmt;
  }
 public void display()
 {
   
   System.out.println("Name : "+name);
   System.out.println("Gender : "+gender);
   System.out.println("Address : "+address);

   System.out.println("Age : "+age);
   System.out.println("Employee ID : "+empid);
   System.out.println("Company Name : "+cmpname);
   System.out.println("Qualification : "+qual);
   System.out.println("Salary : "+sal);
   System.out.println("Teacher ID : "+tchrid);
   System.out.println("Subject : "+sub);
   System.out.println("Department : "+dpmt);
   System.out.println();
  }
 }
public class Inhthree
{
  public static void main(String[] args)
  {
    Scanner s=new Scanner(System.in);
	System.out.print("Enter the number of teachers: ");
    int n = s.nextInt();
    s.nextLine();

        Teacher[] teachers = new Teacher[n];

        for (int i =
		0; i < n; i++) 
		{
            System.out.println("ENTER THE DETAILS OF TEACHER " + (i + 1) );
   System.out.print("Enter the Name : ");
   String name=s.nextLine();
   
   System.out.print("Enter the Gender : ");
   String gender=s.nextLine();
   
   System.out.print("Enter the Address : ");
   String address=s.nextLine();
   
   System.out.print("Enter the Age : ");
   int age=s.nextInt();
   s.nextLine();
   
   System.out.print("Enter the Employee ID : ");
   int empid=s.nextInt();
   s.nextLine();
   
   System.out.print("Enter the Company Name : ");

   String cmpname=s.nextLine();
   
   System.out.print("Enter the Qualification : ");
   String qual=s.nextLine();
   
   System.out.print("Enter the Salary : ");
   double sal=s.nextDouble();
   s.nextLine();
   
   System.out.print("Enter the Teacher ID : ");
   int tchrid=s.nextInt();
   s.nextLine();
   
   System.out.print("Enter the Subject : ");
   String sub=s.nextLine();
   
   System.out.print("Enter the Department : ");
   String dpmt=s.nextLine();
	 
    teachers[i] = new Teacher(name,gender,address,age,empid,cmpname,qual,sal,tchrid,sub,dpmt);

            System.out.println();
        }

        System.out.println("Teacher Details:");
		for (Teacher teacher : teachers) 
		{
            teacher.display();
        }
    }
}
	  
	  