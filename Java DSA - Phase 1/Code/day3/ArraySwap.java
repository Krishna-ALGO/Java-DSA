import java.util.Scanner;
public class ArraySwap {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        
        int n = scn.nextInt();
        int[] arr = new int[n];
        
        System.out.println("Enter the Element of an array");

        for(int i = 0; i<n; i++){
            arr[i] = scn.nextInt();
        }

        // Swap array first & last Element
        int temp = arr[0];
        arr[0] = arr[n-1];
        arr[n-1] = temp;

        for(int i = 0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
