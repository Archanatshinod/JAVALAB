
import java.util.Scanner;
class Fib implements Runnable
{
  int a=0,b=1,sum=0,n;
Fib(int n)
{
this.n=n;
}
        public void run()
        {
                System.out.println("Fibonacci series:");
        for (int i = 1; i <= n; i++)
     {
      System.out.println(a);
      sum=a+b;
      a=b;
      b=sum;
      }
        }
}
class Even implements Runnable
{
int number;
Even(int number)
{
this.number=number;
}
        public void run()
        {
        int i;
         System.out.println("EVEN NUMBERS");

                for(i = 1; i <= number; i++)
                {
                        if(i % 2 == 0)
                        {
                                System.out.print(i+ "\n");
                        }
                }
        }}
class Main
{
        public static void main(String args[])
 {
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter n:");
                int n=sc.nextInt();
                Fib f=new Fib(n);
                 System.out.println("\n Enter the number:");
                int  number = sc.nextInt();
                Even e=new Even(number);
                Thread t1 =new Thread(f);
                Thread t2=new Thread(e);

                t1.start();
        t2.start();

        }
}