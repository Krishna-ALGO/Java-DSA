import java.util.Scanner;
public class RotateMatrix90Degree {
    public static void rotateMatrixBy90(int[][] matrix , int n){
        // Transpose 
        for(int i = 0 ; i<n; i++){
            for(int j = i+1; j<n ; j++){
                // Swap the matrix Element
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        // Reverse

        for(int i =0; i<n ; i++){
            int start = 0;
            int end = n -1;

            while(start < end){
                int temp = matrix[i][start];
                matrix[i][start] = matrix[i][end];
                matrix[i][end] = temp;

                start++;
                end--;
            }
        }
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the size of the matrix:");
        int n = scn.nextInt();

        int[][] matrix = new int[n][n];

        System.out.println("Enter the elements of an Matrix : ");
        for(int i=0; i<n; i++){
            for(int j = 0; j<n; j++){
                matrix[i][j] = scn.nextInt();
            }
        }

        rotateMatrixBy90(matrix , n);

        System.out.println("Rotated Matrix");
        for(int i =0; i<n ; i++){
            for(int j =0 ; j<n; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
