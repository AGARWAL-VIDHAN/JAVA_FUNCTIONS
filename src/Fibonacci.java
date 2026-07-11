import java.util.Scanner;

public class Fibonacci {
    public static void fibo(int a){
       int b=0,c=1;
       for(int i=1;i<=a;i++){
           System.out.print(b+" ");
           int d=b+c;
           b=c;
           c=d;
            }
        }
    public static void main(String[] args){
        Scanner ch=new Scanner(System.in);
        System.out.print("ENTER THR RANGE OF FIBONACCI SERIES: ");
        int n = ch.nextInt();
        fibo(n);
    }
}
