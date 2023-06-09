import java.util.Scanner;
class Main
{
public static void main(String args[])
{
Scanner input=new Scanner(System.in);
int i,n,flag=0;
int search;
System.out.println("enter the no.of .elements:");
n=input.nextInt();
int arr[]=new int[n];
for(i=0;i<n;i++)
{
System.out.println("enter the element:");
arr[i]=input.nextInt();
}
System.out.println("enter the element to be searched:");
search=input.nextInt();
for(i=0;i<n;i++)
{
if(arr[i]==search)
{
System.out.println("element "+search+" found");
flag=1;
break;
}}
if(flag==0)
{
  {
System.out.println("element not found");
}
}
}
                          