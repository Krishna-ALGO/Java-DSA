import java.util.Scanner;
public class MatrixMultiplication {
    public static int[][] multiplyMatrix(int[][] A , int[][] B){
        int m = A.length; // row of A
        int n = A[0].length; // col of A or can be row of B B.length
        int p = B[0].length; // col of B
        int[][] C = new int[m][p];

        for(int i = 0 ;i<m; i++){
            for(int j = 0 ; j<p; j++){
                int sum = 0;
                for(int k = 0 ; k<n ; k++){
                    sum += A[i][k] * B[k][j];
                }
                C[i][j] = sum;
            }
        }

        return C;

    }
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the numbers of rows for Matrix A:");
        int rowsA = scn.nextInt();
        System.out.println("Enter the numbers of Columns for Matrix A:");
        int colsA = scn.nextInt();
        int[][]A = new int[rowsA][colsA];
        System.out.println("Enter the elements of Matrix A");
        for(int i=0 ; i< rowsA; i++){
            for(int j = 0; j< colsA; j++){
                A[i][j] = scn.nextInt();
            }
        }
        System.out.println("Enter the numbers of rows for Matrix B:");
        int rowsB = scn.nextInt();
        System.out.println("Enter the numbers of Columns for Matrix B:");
        int colsB = scn.nextInt();
        int[][]B = new int[rowsB][colsB];
        System.out.println("Enter the elements of Matrix B");
        for(int i=0 ; i< rowsB; i++){
            for(int j = 0; j< colsB; j++){
                B[i][j] = scn.nextInt();
            }
        }
        
        // Check if matrices can be multiplied;
            if(colsA != rowsB){
                System.out.println("Matrix can't multiply");
                return;
            }
        
            int[][] C = multiplyMatrix(A,B);

            System.out.println("Matrix C Resultant");
            for(int i = 0 ; i<C.length; i++){
                for(int j =0 ; j<C[i].length ; j++){
                    System.out.print(C[i][j] + " ");
                }
                System.out.println();
            }

    }
}
