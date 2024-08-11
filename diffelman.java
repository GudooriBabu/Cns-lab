import java.util.*;
public class diffelman {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter first secret number: ");
        int a=sc.nextInt();
        System.out.println("Enter modulp(p): ");
        int p=sc.nextInt();
        System.out.println("Enter primitive root of: "+p);
        int g=sc.nextInt();
        System.out.println("Enter 2nd secret number: ");
        int b=sc.nextInt();
        int A=(int)Math.pow(g,a)%p;
        int B=(int)Math.pow(g,b)%p;
        int s_a=(int)Math.pow(B,a)%p;
        int s_b=(int)Math.pow(A,b)%p;
        if(s_a==s_b){
            System.out.println("1st and 2nd persons can communicate with each other!!!");
            System.out.println("Thay share a srcret number of: "+s_a);
        }
        else{
            System.out.println("1st and 2nd person cannot communicate with each other!!!");
        }
    }
    
}
