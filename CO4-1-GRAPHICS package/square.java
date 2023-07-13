package Graphics;
import java.util.Scanner;
interface Area3
{
void get3();
void show3();
}
public class Squarep implements Area3
{
Scanner sc=new Scanner(System.in);
int s;
int area3;
public void get3()
{
System.out.println("enter the side  of square:");
s=sc.nextInt();
}
public void show3()
{
area3=s*s;
System.out.println("the area of square:"+area3);
}
}
~
