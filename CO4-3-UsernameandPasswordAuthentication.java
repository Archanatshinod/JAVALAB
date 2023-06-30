import java.util.Scanner;
class Username_Exception extends Exception {
  public Username_Exception(String user) {
  super(user);
 }
}
 class Password_Exception extends Exception {
  public Password_Exception(String pass) {
  super(pass);
 }
}
class Main
 {
  public static void main(String[] args)
  {
    Scanner s = new Scanner(System.in);
  String username, password,uname,pwd;
username="Archana";
password="archana123";
  System.out.print("ENTER USERNAME :");
  uname = s.nextLine();
  System.out.print("ENTER PASSWORD:");
  pwd = s.nextLine();
    try {
   if(!uname.equals(username))
{
throw new Username_Exception("Username is incorrect");
    }
else if(!password.equals(pwd)) 
{
    
    throw new Password_Exception("Incorrect password !!!");
}
   else
{
    System.out.println("LOGIN SUCCESSFULLY  !!!");
}
  }
  catch (Username_Exception u) {
   System.out.println("Exception caught !!!");
System.out.println("exception:"+u);
  }
  catch (Password_Exception p) {
   System.out.println("Exception caught !!!");
System.out.println("exception:"+p);
  }
  
 }
}
