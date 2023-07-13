package Graphics;
import java.util.Scanner;
interface Area2
{
void get2();
void show2();
}
public class Circlep implements Area2
{
Scanner sc=new Scanner(System.in);
int r;
double area2;
public void get2()
{
System.out.println("enter the radius of circle:");
r=sc.nextInt();
}
public void show2()
{
area2=3.14*r*r;
System.out.println("the area of circle:"+area2);
}
}
~
