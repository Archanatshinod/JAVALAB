import java.util.Scanner;
class Student{
int rollno,mark;
String name;
Scanner sc=new Scanner(System.in);
void get()
{
System.out.println("ENTER STUDENT DETAILS");
System.out.println("enter roll no:");
rollno=sc.nextInt();
System.out.println("enter name:");
name=sc.next();
System.out.println("enter mark:");
mark=sc.nextInt();
}
class Sports
{
String sportname;
int ap;
Scanner sc=new Scanner(System.in);
void read()
{
System.out.println("enter the sport name:");
sportname=sc.next();
System.out.println("enter the activity point:");
ap=sc.nextInt();
}
void display()
{
System.out.println("  ");
System.out.println("STUDENT DETAILS");
System.out.println("_______________");
System.out.println("roll no:"+rollno);
System.out.println("name:"+name);
System.out.println("marks:"+mark);
System.out.println("sport name:"+sportname);
System.out.println("activity points:"+ap);
}
}}
class Main()
{
public static void main(String args[])
{
Student st=new Student();
Student.Sports sp=st.new Sports();
st.get();
sp.read();
sp.display();
}
}
