import java.util.Scanner;

public class _2D_ARRAYS_SEARCH {
    public static void main( String[] args){
        Scanner ch=new Scanner(System.in);
        System.out.print("ENTER NUMBER OF ROWS:");
        int rows= ch.nextInt();
        System.out.print("ENTER NUMBER OF COLUMNS:");
        int columns= ch.nextInt();
        int[][] matrix=new int[rows][columns];
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                System.out.print("ENTER ELEMENT FOR INDEX ("+i+","+j+")");
                matrix[i][j]= ch.nextInt();
            }
            System.out.println();
        }
        System.out.print("ENTER ELEMENT TO BE SEARCHED:");
        int n= ch.nextInt();
        for(int i=0;i<rows;i++) {
            for (int j = 0; j < columns; j++) {
                if (n==matrix[i][j])
                    System.out.println(n+" IS AT ("+i+","+j+") IN THIS MATRIX");
            }
        }
    }
}
