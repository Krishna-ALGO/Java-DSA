import java.util.Scanner;
public class bubbleSort {
    public static void bubblesort(int[]arr , int n){
        int swapcount = 0 ; 

        for(int i =0; i < n -1 ; i++){
            for(int j = 0; j < n-i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapcount++;
                }
            }
        }
        System.out.println(swapcount);
        System.out.println(arr[0]);
        System.out.println(arr[n-1]);
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i< n; i++){
            arr[i] = scn.nextInt();
        }
        bubblesort(arr , n);
    }
}
