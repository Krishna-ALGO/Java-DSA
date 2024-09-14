import java.util.Scanner;
public class WaveTraversal {
    
    public static void waveTraversal(int[][] matrix , int m , int n){
        for(int j = 0 ; j<n ; j++){
            if(j % 2 ==0){
                for(int i =0 ; i<m ; i++){
                    System.out.print(matrix[i][j] + " ");
                }
            }else{
                for(int i = m-1 ; i>=0 ; i--){
                    System.out.print(matrix[i][j] + " ");
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the number of Rows:");
        int m = scn.nextInt();
        System.out.println("Enter the number of Columns:");
        int n = scn.nextInt();

        int[][] matrix = new int[m][n];
        System.out.println("Enter the Element of an matrix");

        for(int i =0; i<m ; i++){
            for(int j =0 ; j< n ; j++){
                matrix[i][j] = scn.nextInt();
            }
        }

        System.out.println("Wave Traversal");
        waveTraversal(matrix , m ,n);

    }
}
