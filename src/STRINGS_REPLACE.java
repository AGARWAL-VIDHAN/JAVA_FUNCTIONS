import java.util.Scanner;

public class STRINGS_REPLACE {
    public static void main(String[] args){
        Scanner ch=new Scanner(System.in);
        System.out.print("ENTER STRING:");
        String name= ch.next();
        String result="";
        for(int i=0;i<name.length();i++){
            if(name.charAt(i) =='e' || name.charAt(i) =='E'){
                result=result+"i";
            }
            else
                result+=name.charAt(i);
        }
        System.out.println(result);
    }
}
