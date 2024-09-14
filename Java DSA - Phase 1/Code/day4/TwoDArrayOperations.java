import java.util.Scanner;   
public class TwoDArrayOperations {
    public static int[][] intitalizeArray(int rows , int cols){
        Scanner scn = new Scanner(System.in);
        int[][] arr = new int[rows][cols];
        System.out.println("Enter the elements of an array:");
        for(int i =0 ; i< rows ; i++){
            for(int j = 0 ; j< cols ; j++){
                arr[i][j] = scn.nextInt();
            }
        }
        return arr;
    }

    public static void printArray(int[][] arr){
        System.out.println("Array Element");
        for(int i = 0 ; i < arr.length ; i++){
            for(int j = 0 ; j< arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void modifyElement(int[][] arr , int row , int col , int newValue){
        if(row >=0 && row < arr.length && col >=0 && col< arr[row].length){
            arr[row][col] = newValue;
        }else{
            System.out.println("Invalid Index");
        }
    }

    public static int sumOfElement(int[][] arr){
        int sum =0;
        for(int i = 0; i< arr.length; i++){
            for(int j = 0 ; j< arr[0].length ; j++){
                sum += arr[i][j];
            }
        }
        return sum;
    }
    public static int maxElement(int[][] arr){
        int max = arr[0][0];
        for(int i = 0 ; i< arr.length ; i++){
            for(int j = 0 ; j<arr[0].length ; j++){
                if(arr[i][j] > max){
                    max = arr[i][j];
                }
            }
        }
        return max;
    }
    public static int minElement(int[][] arr){
        int min = arr[0][0];
        for(int i = 0 ; i< arr.length ; i++){
            for(int j = 0 ; j<arr[0].length ; j++){
                if(arr[i][j] < min){
                    min = arr[i][j];
                }
            }
        }
        return min;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int rows = scn.nextInt();
        System.out.println("Enter the number of columns");
        int cols = scn.nextInt();
        int[][] arr = intitalizeArray(rows , cols);
        printArray(arr);

        // Modify the Element
        System.out.println("Enter the row index to modify: ");
        int modifyRow = scn.nextInt();
        System.out.println("Enter the column index to modify: ");
        int modifyCol = scn.nextInt();
        System.out.println("Enter the new Value");
        int newValue = scn.nextInt();

        modifyElement(arr , modifyRow, modifyCol , newValue);
        printArray(arr);

        int sum = sumOfElement(arr);
        System.out.println("Sum of all Elements : " + sum);

        int max = maxElement(arr);
        System.out.println("Max of an Array :" + max);
        int min = minElement(arr);
        System.out.println("Min of an Array :" + min);
    }
}
