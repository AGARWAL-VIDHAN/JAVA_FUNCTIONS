import java.util.Scanner;

public class ARRAYS_STRING_NAMES {
    public static void main(String[] args) {
        Scanner ch = new Scanner(System.in);
        System.out.print("ENTER THE SIZE OF THE NAME LIST:");
        int size = ch.nextInt();
        String names[] = new String[size];
        for (int i = 0; i < size; i++) {
            System.out.print("ENTER THE NAME:");
            names[i] = ch.next();
        }
        for (int i = 0; i < size; i++) {
            System.out.println(names[i]);
        }
    }
}
