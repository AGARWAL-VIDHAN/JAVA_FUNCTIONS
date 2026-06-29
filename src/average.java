import java.util.Scanner;

public class average {
    public static int average(int a,int b,int c){
     int res=(a+b+c)/3;
     return res;
    }
    public static void main(String[] args){
        Scanner ch=new Scanner(System.in);
        System.out.println("ENTER THREE NUMBERS:");
        int d=ch.nextInt();
        int e=ch.nextInt();
        int f=ch.nextInt();
        System.out.print("THE AVERAGE OF THESE NUMBERS IS ");
        System.out.print(average(d,e,f));
    }
}
