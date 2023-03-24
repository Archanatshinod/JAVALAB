import java.util.Scanner;
public class Area{
void area(int l,int b)
{
int a=l*b;
System.out.println("Area of rectangle :"+a);
}
void area(double b,double h)
{
double a=0.5*b*h;
System.out.println("Area of triangle :"+a);
}
void area(double r)
{
double a=3.14*r*r;
System.out.println("Area of circle:"+a);
}
void area(int s)
{
int a=s*s;
System.out.println("Area of rectangle :"+a);
}
}
class Main
{
public static void main (String args [])
{
int l1,b1,s;
double b2,h,r;
Area a1=new Area();
Scanner input=new Scanner(System.in);
System.out.println("enter length of rectangle :");
l1=input.nextInt();
System.out.println("enter breadth of rectangle :");
b1=input.nextInt();
a1.area(l1,b1);
System.out.println("enter base of triangle :");
b2=input.nextInt();
System.out.println("enter height of triangle :");
h=input.nextInt ();
a1.area(b2,h);
System.out.println("enter the radius of circle");
r=input.nextInt();
a1.area(r);
System.out.println("enter side of square :");
s=input.nextInt();
a1.area(s);
}
}


