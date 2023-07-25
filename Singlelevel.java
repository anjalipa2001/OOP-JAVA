import java.util.Scanner;
class Employee
{
int empid;
String name;
int salary;
String address;
Employee(int empid,String name,int salary,String address)
{
  this.empid=empid;
  this.name=name;
  this.salary=salary;
  this.address=address;
}
}
class Teacher extends Employee
{
  String dpmt;
  String sub;
  Teacher(int empid,String name,int salary,String address,String dpmt,String sub)
  {
    super(empid,name,salary,address);
	this.dpmt=dpmt;
	this.sub=sub;
  }
  void display()
  {
	System.out.println("\nTEACHER DETAILS");
    System.out.println("\nEMPLOYEE ID : "+empid);
	System.out.println("\nEMPLOYEE NAME : "+name);
	System.out.println("\nEMPLOYEE SALARY : "+salary);
	System.out.println("\nEMPLOYEE ADDRESS : "+address);
	System.out.println("\nEMPLOYEE DEPARTMENT : "+dpmt);
	System.out.println("\nEMPLOYEE SUBJECT TAUGHT : "+sub);
  }
 }
 class Singlelevel
 {
   public static void main(String[] args)
   {
     Scanner s=new Scanner(System.in);
	 System.out.print("\nEnter the number to add : ");
	 int n=s.nextInt();
	 Teacher[] teachers=new Teacher[n];
	 for(int i=0;i<n;i++)
	 {
	   System.out.println("\n Enter the details of employee "+(i+1));
	   System.out.print("\n  EMPLOYEE ID : ");
	   int empid=s.nextInt();
	System.out.print("\n EMPLOYEE NAME : ");
	String name=s.next();
	System.out.print("\n EMPLOYEE SALARY : ");
	int salary=s.nextInt();
	System.out.print("\n EMPLOYEE ADDRESS : ");
	String address=s.next();
	System.out.print("\n  EMPLOYEE DEPARTMENT : ");
	String dpmt=s.next();
	System.out.print("\n EMPLOYEE SUBJECT TAUGHT : ");
	String sub=s.next();
	teachers[i]=new Teacher(empid,name,salary,address,dpmt,sub);
	System.out.println();
	}
	System.out.println("\n TEACHER DETAILS");
	for(Teacher teacher:teachers)
	{
	  teacher.display();
	 }
	}	
	   
 }
 
