import java.util.Scanner;

public class prime{
    public static boolean IsPrime(int a){
        if(a<0){
            return false;
        }
        for(int i=2;i<=Math.sqrt(a);i++){
            if(a%i==0){
                return false ;
            }
        }
    return true;
    }
    public static void main(String[] args){
        Scanner ch=new Scanner(System.in);
        System.out.println("ENTER ANY NUMBER:");
        int num=ch.nextInt();
        if(IsPrime(num))
        {
            System.out.println("PRIME NUMBER");
        }
        else{
            System.out.println("NOT A PRIME NUMBER");
        }
    }
}