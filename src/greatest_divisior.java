import java.util.Scanner;

public class greatest_divisior {
    public static int gcd(int a,int b){
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner ch=new Scanner(System.in);
        System.out.print("ENTER FIRST NUMBER:");
        int num1= ch.nextInt();
        System.out.print("ENTER SECOND NUMBER:");
        int num2= ch.nextInt();
        System.out.println("THE GREATEST COMMON DIVISIOR OF "+num1+" AND "+num2+" IS "+gcd(num1,num2));
    }
}