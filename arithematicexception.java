import java.util.Scanner;
class Except
{
 public static void main(String args[])
 {
  int a,b,c;
  Scanner sc=new Scanner(System.in);
  System.out.println("enter the first number a:");
  a=sc.nextInt();
  System.out.println("enter the second number b:");
  b=sc.nextInt();
  try{
      c=a/(a-b);
      System.out.println("c ="+c);
     }
  catch(ArithmeticException e)
     {
      System.out.println("caught by Arithmetic exception:-----"+e);
     }
  finally
     {
      System.out.println("finally block");
     }
 System.out.println("a="+a);
 System.out.println("b="+b);
 System.out.println("----END----");
 }
}
