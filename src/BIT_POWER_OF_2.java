import java.util.Scanner;

public class BIT_POWER_OF_2 {
    public static void main(String[] args){
        Scanner ch=new Scanner(System.in);
        System.out.print("ENTER ANY NUMBER:");
        int n= ch.nextInt();
        int m=n-1;
        int z= n & m;
        if(z==0){
            System.out.println("POWER OF 2");
        }
        else
            System.out.println("NOT THE POWER OF 2");

    }
}
