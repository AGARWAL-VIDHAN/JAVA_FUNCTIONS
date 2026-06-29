import java.util.Scanner;

public class sum_of_odd {
    public static int odd_sum(int n) {
        int res=0;
        for(int i=1;i<=n;i++){
            if(i%2!=0){
                res+=i;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner ch=new Scanner(System.in);
        System.out.println("enter a number:");
        int a= ch.nextInt();
        System.out.println(odd_sum(a));
    }
}
