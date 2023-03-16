class Armstrong
{
public static void main(String args[]) 
{
int a,arm=0,n,temp,n=153;
temp=n;
while(n!=0)
{
a=n%10;
arm=arm+(a*a*a);
n=n/10;
}
System.out.println("number="+temp);
if(arm==temp)
System.out.println("armstrong number ");
else
System.out.println(" not a armstrong number ");
}
}
