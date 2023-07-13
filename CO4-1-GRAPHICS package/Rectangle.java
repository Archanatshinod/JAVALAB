package Graphics;
import java.util.Scanner;
interface Area1
{
void get1();
void show1();
}
public class Rectp implements Area1
{
Scanner sc=new Scanner(System.in);
int l,b;
int area1;
public void get1()
{
System.out.println("enter the length of rectangle:");
l=sc.nextInt();
System.out.println("enter the breadth of rectangle:");
b=sc.nextInt();
}
public void show1()
{
area1=l*b;
System.out.println("the area of rectangle:"+area1);
}
}
