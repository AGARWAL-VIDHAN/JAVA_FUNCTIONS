import java.util.Scanner;

public class ARRAYS_MAX_AND_MIN {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER THE SIZE:");
        int size= sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            System.out.print("ENTER THE NUMBER:");
            arr[i]= sc.nextInt();
        }
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i=0;i<size;i++){
            if(arr[i]<min)
                min=arr[i];
            if (arr[i] > max)
                max = arr[i];
        }
        System.out.println("MAXIMUM NUMBER OF THIS ARRAY IS "+max);
        System.out.println("MINIMUM NUMBER OF THIS ARRAY IS "+min);
    }
}
