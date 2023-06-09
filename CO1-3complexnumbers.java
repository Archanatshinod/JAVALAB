import java.util.Scanner;
class Complex
{
int real,img;
Complex(int r,int i)
{
real=r;
img=i;
}
Complex addc(Complex first,Complex second)
{
Complex sum=new Complex(0,0);
sum.real=first.real+second.real;
sum.img=first.img+second.img;
return sum;
}}
class Main
{
public static void main(String args[])
{
 Scanner input=new Scanner(System.in);
int r1,r2,i1,i2;
System.out.println("enter the real part of first complex number:");
r1=input.nextInt();
System.out.println("enter the imaginary part of first complex number:");
i1=input.nextInt();
System.out.println("enter the real part of second complex number:");
r2=input.nextInt();
System.out.println("enter the imaginary part of second complex number:");
i2=input.nextInt();
Complex first=new Complex(r1,i1);
Complex second=new Complex(r2,i2);
Complex sum=new Complex(0,0);
sum=sum.addc(first,second);
System.out.println("complex number 1: "+first.real+"+"+first.img+"i");
System.out.println("complex number 2: "+second.real+"+"+second.img+"i");
System.out.println("sum of this complex numbers : "+sum.real+"+"+sum.img+"i");
}
}
