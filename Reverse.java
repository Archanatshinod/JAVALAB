class Reverse 
{
public static void main(String args[])
{
int num = 1234, r = 0,d,number;
number=num;
    while(num> 0)
{
  d = num % 10;
   r= r* 10 + d;
   num /= 10;
    }
System.out.println("original number:"+number);
System.out.println("Reversed Number: ");
System.out.println( r);
  }
}
