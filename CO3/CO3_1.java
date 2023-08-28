import java.util.Scanner;
class Area
{
 int l,b,a;
 float br,h,r;
 double area;
 Area (int l1,int b1)
 {
  l=l1;
  b=b1;
}
 Area (int a1)
{
  a=a1;
 
}
Area (float b1,float h1)
{
  br=b1;
  h=h1;
  
}
Area (float r1)
{
  r=r1;
}
void showr()
{
  area=l*b;
 System.out.println("Area of Rectangle: " +area);
}
void shows()
{
 area=a*a;
 System.out.println("Area of Square: " +area);
}
void showt()
{
 area=0.5*br*h;
 System.out.println("Area of Triangle: " +area);
}
void showc()
{
 area=3.14*r*r;
 System.out.println("Area of Circle: " +area);
}
}
class Main
{
public static void main(String args[])
{
 Scanner input=new Scanner(System.in);
 int choice=1;
System.out.println("1.Rectangle\n2.Square\n3.Triangle\n4.Circle\n5.Exit");
while(choice<=5)
{
System.out.println("Enter the choice:");
choice=input.nextInt();
if(choice==1)
{
  System.out.println("Enter length:");
  int l1=input.nextInt();
  System.out.println("Enter breadth:");
  int b1=input.nextInt();
  Area rec=new Area(l1,b1);
   rec.showr();
}
else if (choice==2)
{
  System.out.println("Enter side:");
  int a1=input.nextInt();
  Area sq=new Area(a1);
   sq.shows();
   
}
else if (choice==3)
{
  System.out.println("Enter base:");
   float b1=input.nextInt();
  System.out.println("Enter height:");
  float h1=input.nextInt();
  Area tri=new Area(b1,h1);
   tri.showt();
    
}
else if (choice==4)
{
  System.out.println("Enter radius:");
  float r1=input.nextInt();
  Area cir=new Area(r1);
   cir.showc();
    
}
else
{
    break;
}
}
}
}