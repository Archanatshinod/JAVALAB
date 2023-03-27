import java.util. Scanner;
Class Product
{
int pcode, price; String pname;
void Read ()
{
Scanner input=new Scanner (System. in) ;
System. Out println ("enter the code: ") pcode=input.nextInt ();
System.out.println ("Enter name: "); pname=input.next();
System.out.println("Enter price: "); 
price=input.nextint ();
class Main{
public static void main (String args[])
{
Product a=new Product ();
Product b=new Product();
Product c=new Product();
a.Read ();
b.Read ();
c.Read ();
if((a.price<b.price) &&(a.price<c.price))
{
System.out.println ("product with pcode:"+a.pcode+",product name: "+a.pname+" has the lowest price: "+a.price);
}
else if((b.price<a.price) && (b.price<c.price))
{
System.out.println ("product with pcode:"+b.pcode+",product name: "+b.pname+" has the lowest price:"+b.price);
}
else
{
System.out.println ("product with pcode: "+c.pcode+", product name: "+c.pname+" has the lowest price: "+c.price)
}
}
}


