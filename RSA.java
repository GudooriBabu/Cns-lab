import java.math.*;
import java.util.Random;
import java.util.Scanner;
public class RSA{
static Scanner sc=new Scanner(System.in);
public static void main(String[] args) throws Exception
{
System.out.print("Enter a prime number:");
BigInteger p=sc.nextBigInteger();
System.out.print("Enter another prime number:");
BigInteger q=sc.nextBigInteger();
BigInteger n=p.multiply(q);
BigInteger n2=(p.subtract(BigInteger.ONE)).multiply(q.subtract(BigInteger.ONE));
BigInteger e=generate(n2);
BigInteger d=e.modInverse(n2);
System.out.println("Encryption keys are:" +e+ "," +n);
System.out.println("Decryption keys are:" +d+ "," +n);
}
private static BigInteger generate(BigInteger FioFn)
{
int y;int GCD;
Random x=new Random();
BigInteger e;
do{
y=x.nextInt(FioFn.intValue()-1);
String l=Integer.toString(y);
e=new BigInteger(l);
BigInteger gcd=FioFn.gcd(e);
GCD=gcd.intValue();
}
while(y<=2 || GCD!=1);
return e;
}
}