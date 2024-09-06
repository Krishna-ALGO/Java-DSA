import java.util.Scanner;
public class SpiralMatrixTraversal {
    
    public static void spiralTraversal(int[][] matrix , int m , int n){
        int top =0;
        int bottom = m -1;
        int left = 0;
        int right = n -1;
        while(top <= bottom && left <= right){
            // Traverse left -> right making top fixed
            for(int i = left; i<=right; i++){
                System.out.print(matrix[top][i] + " ");
            }
            top++;
            // Traverse top -> bottom making right fixed
            for(int i = top; i<=bottom; i++){
                System.out.print(matrix[i][right] + " ");
            }
            right--;
            // Traverse right -> left making bottom fixed
            if(top <= bottom){
                for(int i = right; i>=left; i--){
                    System.out.print(matrix[bottom][i] + " ");
                }
            }
            bottom--;
            // Traverse bottom -> top making left fixed
            if(left <= right){
                for(int i =bottom; i>=top; i--){
                    System.out.print(matrix[i][left] + " ");
                }
            }
            left++;
        }
    }
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int m = scn.nextInt();
        System.out.println("Enter the number of columns:");
        int n = scn.nextInt();

        int[][] matrix = new int[m][n];
        System.out.println("Enter the elements of an matrix");
        for(int i = 0 ; i<m ; i++){
            for(int j =0; j<n; j++){
                matrix[i][j] = scn.nextInt();
            }
        }

        System.out.println("Spiral Traversal");
        spiralTraversal(matrix , m ,n);
        
    }
}
