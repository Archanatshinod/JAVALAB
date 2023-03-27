import java.util.Scanner;
class Symmetric{
void Check(int a[][], int row,int col)
{
int i, j, flag = 0;
System.out.println("The matrix is:");
for (i = 0; i < row; i++) {
for (j = 0; j < col; j++) { 
System.out.print(a[i][j] + " ");
}
System.out.println(" ");
}
int trans[][] = new int[row][col];
for (i = 0; i < col; i++) {
for (j = 0; j < row; j++) {
trans[j][i] = a[i][j];
}}
System.out.println("The transpose matrix is:");
for (i = 0; i < col; i++) {
for (j = 0; j < row; j++) { 
System.out.print(trans[i][j] + " ");
}
System.out.println(" ");
}
for (i = 0; i < row; i++) {
for (j = 0; j < col; j++) {
if (a[i][j] != trans[i][j]) {
flag = 1;
}}}
if (flag == 1) {
System.out.println("The matrix is not symmetric");
}
else{
System.out.println("\nThe matrix is symmetric");
}}
}
class Main{
public static void main(String args[])
{
Scanner input = new Scanner(System.in);
int i, j, row, col;
Symmetric s=new Symmetric();
System.out.print("Enter the number of rows:"); row = input.nextInt();
System.out.println("Enter the number of columns:");
col = input.nextInt();
int a[][]= new int[row][col];
if (row == col) {
System.out.println("Enter the matrix elements:");
for (i = 0; i < row; i++) {
for (j = 0; j < col; j++) {
a[i][j] = input.nextInt();
} }
s.Check(a, row, col);
}
else
{
System.out.println("it is not a square matrix ,so it will not be a symmetric matrix");
}
}
}
