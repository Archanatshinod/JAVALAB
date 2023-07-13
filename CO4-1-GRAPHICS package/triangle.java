package Graphics;
import java.util.Scanner;
interface Area4
{
void get4();
void show4();
}
public class Trianglep implements Area4
{
Scanner sc=new Scanner(System.in);
int h,b;
double area4;
public void get4()
{
System.out.println("enter the height of triangle:");
h=sc.nextInt();
System.out.println("enter the base of triangle:");
b=sc.nextInt();
}
public void show4()
{
area4=0.5*h*b;
System.out.println("the area of triangle:"+area4);
}
}
