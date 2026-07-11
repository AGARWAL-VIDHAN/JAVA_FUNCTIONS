import java.util.Scanner;

public class ARRAYS_SORTING {
    public static void main(String[] args){
        Scanner ch= new Scanner(System.in);
        System.out.print("ENTER SIZE:");
        int size= ch.nextInt();
        int sort[] = new int[size];
        for(int i=1;i<=size;i++){
            System.out.print("ENTER NUMBER " +i+":");
            sort[i-1]= ch.nextInt();
        }
        boolean isAscending=true;
        for(int i=1;i<size-1;i++){
            if (sort[i]>sort[i+1])
            isAscending=false;
        }
        if(isAscending)
            System.out.println("ABOVE ARRAY IS IN ASCENDING ORDER");
        else
            System.out.println("ABOVE ARRAY IS NOT IN ANY ORDER ");
    }
}
