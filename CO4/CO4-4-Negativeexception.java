import java.util.Scanner;
class Negative_Exception extends Exception {
public Negative_Exception(String string) {
		super(string);
	}
}
class Main{
public static void main(String[] args) {
 int n,i; 
float x,average, sum= 0;   
Scanner sc = new Scanner(System.in);     
	     System.out.println("Enter the value of N:"); 
	     N=sc.nextInt(); 
	     for(i=1;i<=N;i++){
	   	 System.out.println("Enter the "+i+" number:");
	   	 try {
	   		  x = sc.nextInt();
	   		  if(x<0){
                 i=i-1;
	   			  throw new Negative_Exception("Negative number are not allowed!!\nPlease Enter the Positive Number");
	   		  }
	                  
	   		  else
	   			  {
	   	                  sum+=x;
	   			  }
	   		  }
	   	 
	   	  catch (Negative_Exception neg) {
	   		 System.out.println ("exception occured:"+neg);
	                System.out.println("Enter the "+i+" number:");
	                Scanner sc1 = new Scanner(System.in);
	                   x=sc1.nextInt();
	                 sum+=x;
	                }
	   	 }    
	      
	       System.out.println("The Average of non-negative numbers:"+sum/N);  
	   }   
	}

