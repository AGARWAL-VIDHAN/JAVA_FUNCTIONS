import java.util.Scanner;

public class DIVISION_WITHOUT_DIVISION_OPERATOR {
    public static void main(String[] args){
        Scanner ch=new Scanner(System.in);
        System.out.print("ENTER NUMBER TO BE DIVIDED:");
        int num1= ch.nextInt();
        System.out.print("ENTER NUMBER BY WHICH NUM1 IS TO BE DIVIDED :");
        int num2= ch.nextInt();
        int i=1;
        boolean a=true;
        while (a==true){
            if (num2*i==num1){
                System.out.println("ON DIVIDING "+num1+" BY "+num2+" WE GET "+i);
                break;
            }
            else
                i++;
        }
    }
}
