import java.util.Scanner;

public class BIT_COUNT_1 {
    public static void main(String[] args){
        Scanner ch=new Scanner(System.in);
        System.out.print("ENTER THE NUMBER:");
        int n= ch.nextInt();
        int count=0;
        while(n>0){
            n=n & (n-1);
            count+=1;
        }
        System.out.println("THE NUMBER OF 1 IN BINARY FORMAT = "+count);
    }
}
