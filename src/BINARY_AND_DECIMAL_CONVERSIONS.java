import java.util.Scanner;

public class BINARY_AND_DECIMAL_CONVERSIONS {
public static int binarytodecimal( String b){
    int base=1;
    int dec_value=0;
    for(int i=b.length()-1;i>=0;i--){
        if(b.charAt(i)=='1'){
            dec_value+=base;
        }
        base*=2;
    }
    return dec_value;
}
public static String decimaltobinary(int n){
    String bin="";
    while(n>0){
        int rem=n%2;
        bin=rem+bin;
        n=n /2;
    }
    return bin;
}
public static void main(String[] args){
    Scanner ch=new Scanner(System.in);
    System.out.print("ENTER THE BINARY NUMBER:");
    String bin= ch.next();
    System.out.println(binarytodecimal(bin));
    System.out.print("ENTER THE DECIMAL NUMBER:");
    int num= ch.nextInt();
    System.out.println(decimaltobinary(num));
}
}
