import java.util.Scanner;
  class Username extends Exception
  {
    Username(String msg)
	{
	  System.out.println(msg);
	}
  }
  
  class Check
  {
    public static void main(String[] args)
	{
	  Scanner s=new Scanner(System.in);
	  String user="anjali";
	  String pswd="2001";
	  System.out.print("ENTER THE USERNAME : ");
	  String username=s.nextLine();
	  System.out.print("ENTER THE PASSWORD : ");
	  String password=s.nextLine();
	  try
	  {
	  if((username.equals(user)) && (password.equals(pswd)))
	    System.out.println("\n LOGIN SUCCESSFULL");
	  else
	    throw new Username("Username or Password is incorrect");
	  }
	  catch(Exception e)
	  {
	    System.out.println("TRY AGAIN!!!");
	  }
	
    }	 
  }  
	  
	  
	