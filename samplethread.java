import java.util.Scanner;
class Fibonacci implements Runnable
{
  int a=0,b=1,sum=0,n;
	public void run()
	{
		System.out.println("_____FIBONACCI SERIES_____");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter limit:");
		n=sc.nextInt();
		System.out.println("fibonacci series upto "+n+":");
	for (int i = 1; i <= n; i++)
     {
      System.out.println(a);
      sum=a+b;
      a=b;
      b=sum;
      try  
            {  
                Thread.sleep(500);  
            }
	catch(InterruptedException e)
	{System.out.println(e);} 
	System.out.println(" ");  
		 
      }
	}
}
class Evennumbers implements Runnable
{ 
	public void run()
	{  
	int num,i;
	 Scanner sc= new Scanner(System.in);
	 System.out.println("____EVEN NUMBERS_____");
	 System.out.println(" Enter the limit:");
	 num = sc.nextInt();	
		for(i = 1; i <= num; i++)
		{
			if(i % 2 == 0)
			{
				System.out.print(i+ "\n"); 
				try  
            {  
                Thread.sleep(500);  
            }
	catch(InterruptedException e)
	{System.out.println(e);} 
	System.out.println(" ");  
		}  
		}	
	}}
class Main
{
	public static void main(String args[])
	{  

		Fibonacci f=new Fibonacci();
		Evennumbers e=new Evennumbers();
		Thread t1 =new Thread(f);   
		 t1.start();
		 Thread t2=new Thread(e); 
    	t2.start();
		
 	}  
}
