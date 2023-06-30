import java.util.Scanner;
class Negative_Exception extends Exception {
public Negative_Exception(String str) {
super(str);
}
}
class Main{
public static void main(String args[])
{
 int n,i; 
float x, sum= 0;   
Scanner sc = new Scanner(System.in);
System.out.println("Enter the value of N:"); 
n=sc.nextInt(); 
for(i=1;i<=n;i++){
System.out.println("Enter the number:");
try {
x = sc.nextInt();
if(x<0)
{
    i=i-1;
 throw new Negative_Exception("Negative number are not allowed!!");
 
}
else
{
sum+=x;
}
    
}
catch (Negative_Exception ne) {
 System.out.println ("exception occured:"+ne);

 }

}    
 System.out.println("The Average of "+n+" positive numbers:"+sum/n);  
	   }   
	}

