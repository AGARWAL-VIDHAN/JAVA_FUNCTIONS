import java.util.Scanner;

public class greatest {
    public static int greater_num(int a,int b){
        if(a>b)
            return a;
        else
            return b;
    }
    public static void main(String[] args) {
        Scanner ch=new Scanner(System.in);
        System.out.print("enter first number:");
        int c= ch.nextInt();
        System.out.print("enter second number:");
        int d= ch.nextInt();
        System.out.print("GREATER NUMBER IS ");
        System.out.print(greater_num(c,d));
    }
}
