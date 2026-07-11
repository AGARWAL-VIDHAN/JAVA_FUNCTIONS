import java.util.Scanner;

public class SPIRAL_ORDER_MATRIX {
    public static void main(String[] args){
        Scanner ch=new Scanner(System.in);
        System.out.print("ENTER NUMBER OF ROWS:");
        int rows= ch.nextInt();
        System.out.print("ENTER NUMBER OF COLUMNS:");
        int columns= ch.nextInt();
        int[][] matrix=new int[rows][columns];
        for(int i=0;i<rows;i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("ENTER ELEMENT FOR INDEX (" + i + "," + j + ") =");
                matrix[i][j] = ch.nextInt();
            }
        }
        System.out.println("YOUR MATRIX IS:-");
        for(int i=0;i<rows;i++){
            for (int j = 0; j < columns; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("YOUR SPIRAL ORDER MATRIX IS:-");
        int rowstart=0;
        int rowend=rows-1;
        int colstart=0;
        int colend=columns-1;
        while(rowstart<=rowend && colstart<=colend){
            for(int i=colstart;i<=colend;i++) {
                System.out.print(matrix[rowstart][i]+" ");
            }
            rowstart++;
            for(int i=rowstart;i<=rowend;i++){
                System.out.print(matrix[i][colend]+" ");
            }
            colend--;
            if (rowstart<=rowend) {
                for (int i = colend; i >= colstart; i--) {
                    System.out.print(matrix[rowend][i] + " ");
                }
                rowend--;
            }
             if(colstart<=colend){
                for (int i = rowend; i >= rowstart; i--) {
                    System.out.print(matrix[i][colstart] + " ");
                }
                colstart++;
            }
        }
    }

}
