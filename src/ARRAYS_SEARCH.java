import java.util.Scanner;

public class ARRAYS_SEARCH {
    public static void main(String[] args){
        Scanner ch=new Scanner(System.in);
        System.out.print("ENTRE THE SIZE OF THE ARRAY:");
        int size= ch.nextInt();
        int marks[]=new int[size];
        for(int i=0;i<size;i++){
            System.out.print("ENTER THE VALUE FOR INDEX "+i+"=");
            marks[i]=ch.nextInt();
        }
        System.out.print("ENTER THE NUMBER TO BE SEARCHED: ");
        int x= ch.nextInt();
        for(int i=0;i<size;i++){
            if(marks[i]==x)
                System.out.print(x+" FOUNDED AT INDEX "+i);
        }
    }
}
