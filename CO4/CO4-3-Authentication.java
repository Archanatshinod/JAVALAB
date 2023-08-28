import java.util.Scanner;
class Username_Exception extends Exception {
  public Username_Exception(String val) {
  super(val);
 }
}
 class Password_Exception extends Exception {
  public Password_Exception(String val) {
  super(val);
 }
}
 class CheckLoginCredential {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
  String username, password,uname,pwd;
username="Archana";
password="archana123";
  System.out.print("ENTER USERNAME :");
  uname = s.nextLine();
  System.out.print("ENTER PASSWORD:");
  pwd = s.nextLine();
    try {
   if(uname!=username)
{
    throw new Username_Exception("Username is incorrect");
}
   else if(!password.equals("a123#")) 
{
    throw new Password_Exception("Incorrect password or username !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
}
   else
{
    System.out.println("LOGIN SUCCESSFULLY  !!!!!!!!!!!!!!!!!");
}
  }
  catch (Username_Exception u) {
   System.out.println("Exception caught !!!!!!!!!!!!!!!!!");
System.out.println("incorrect username  !!!!!!!!!!!!!!!!!");
  }
  catch (Password_Exception p) {
   System.out.println("Exception caught !!!!!!!!!!!!!!!!!");
System.out.println("incorrect password !!!!!!!!!!!!!!!!!");
  }
  finally {
   System.out.println("The finally statement is executed");
  }
 }
}
