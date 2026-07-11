import java.util.Scanner;

public class STRINGS_USERNAME {
    public static void main(String[] args){
        Scanner ch=new Scanner(System.in);
        System.out.print("ENTER EMAIL:");
        String email= ch.next();
        String user="";
        for(int i=0;i<email.length();i++){
            if(email.charAt(i) == '@'){
                break;
            }
            else
                user+=email.charAt(i);
        }
        System.out.println(user);
    }
}
