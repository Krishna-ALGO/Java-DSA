import java.util.Scanner;
public class OddEvenSort {
    public static void oddEvenSort(int[] arr , int n){
        boolean isSorted = false;

        while(!isSorted){
            isSorted = true; 
            // Odd index 
            for(int i = 1; i<=n-2; i+=2){
                if(arr[i] > arr[i+1]){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                    isSorted = false;
                }
            }
            // Even index 
            for(int i = 0; i<=n-2; i+=2){
                if(arr[i] > arr[i+1]){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                    isSorted = false;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] arr = new int[n];
        for(int i = 0 ; i<n ; i++){
            arr[i] = scn.nextInt();
        }

        oddEvenSort(arr , n);
        for(int i=0 ; i<n ; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
