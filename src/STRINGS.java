


import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class STRINGS {
    public static void main(String[] args) {
        Scanner ch = new Scanner(System.in);
        System.out.print("ENTER THE SIZE OF THE ARRAY:");
        int size = ch.nextInt();
        String names[] = new String[size];
        int totallength = 0;
        for (int i = 0; i < size; i++) {
            System.out.print("ENTER NAME FOR INDEX " + i + "=");
            names[i] = ch.next();
            totallength += names[i].length();
        }
        System.out.print(totallength);

    }
}
