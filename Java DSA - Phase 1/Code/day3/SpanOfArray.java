import java.util.Scanner;
public class SpanOfArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        
        int n = scn.nextInt();
        int[] arr = new int[n];
        
        System.out.println("Enter the Element of an array");

        for(int i = 0; i<n; i++){
            arr[i] = scn.nextInt();
        }

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i = 0 ; i<n; i++){
            if(arr[i] > max){
                max = arr[i];
            }
            if(arr[i] < min){
                min = arr[i];
            }
        }
        int span = max - min;
        System.out.println(span);


    }
}
