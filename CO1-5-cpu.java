
import java.util.Scanner; 
public class Cpu{
    int price;
     class Processor{
        int cores;
        String producer;
        Processor(int no, String manu){
            cores=no;
            producer=manu;
        }
        void display(){
        System.out.println("----PROCESSOR----");
        System.out.println("No. of Cores: "+cores);
        System.out.println("Manufacturer :"+producer);
    }
    }
    static class Ram{
        int mem;
        String manuf;
        Ram(int memory,String producer ){
            mem=memory;
            manuf=producer;
        }
        void display(){
        System.out.println("----RAM----");
        System.out.println("Memory :"+mem+"GB");
        System.out.println("Manufacturer :"+manuf+"\n");
    }}
    public static void main(String[] args) {
        int n,m;
        String manp,manr;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the no. of Cores:");
        n=sc.nextInt();
        System.out.println("Enter the Processor Manufacturer name:");
        manp=sc.next();
        Cpu c= new Cpu();
        Cpu.Processor p = c.new Processor(n,manp);
        System.out.println("Enter the size of memory:");
        m=sc.nextInt();
        System.out.println("Enter the RAM Manufacturer name:");
        manr=sc.next();
        Cpu.Ram r= new Cpu.Ram(m,manr);
         p.display();
         r.display();

    }
}
