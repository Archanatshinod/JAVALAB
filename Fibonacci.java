class Fibo {
public static void main(String args[]) {
int n = 10, a = 0, b= 1,c=1;
System.out.println("Fibonacci Series:");
for (int i = 1; i <= n; ++i) {
System.out.println(c);
c = a+b;
a = b;
 b = c;
} }
}
