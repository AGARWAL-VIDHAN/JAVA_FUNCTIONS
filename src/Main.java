import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

    Scanner ch = new Scanner(System.in);
    int usernumber = 0;
    int mynumber = (int) (Math.random() * 100);


   do {
        System.out.println("Guess any nymber(1-100):");
        usernumber = ch.nextInt();
        if (usernumber == mynumber) {
            System.out.println("CORRECT!!!!");
            System.out.println("YOU GUESSED THE CORRECT NUMBER.");
            break;
        }
        else if (usernumber < mynumber) {
            System.out.println("your nmmber is too small");

        }
        else {
            System.out.println("your number is too large");
        }
    } while(usernumber>=0);
        System.out.println("MY NUMBER WAS");
        System.out.print(mynumber);
}
}







