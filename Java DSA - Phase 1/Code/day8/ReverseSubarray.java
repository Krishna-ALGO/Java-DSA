import java.util.Arrays;
import java.util.Scanner;
public class ReverseSubarray {
    public static void reverseSubarray(int[] arr, int left , int right){
        if(left >= right){
            return;
        }
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;

        reverseSubarray(arr, left + 1, right - 1);
        
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int n = scn.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements of the array");
        for(int i =0 ; i<n; i++){
            arr[i] = scn.nextInt();
        }
        System.out.println("Enter the Left Index : ");
        int left = scn.nextInt();
        System.out.println("Enter the Right Index : ");
        int right = scn.nextInt();

        if(left < 0 || right >=n || left > right){
            System.out.println("Invalid Indices");
        }else{
            reverseSubarray(arr , left , right);
            System.out.println("After Reversing the subarray");
            System.out.println(Arrays.toString(arr));
        }
    }
}
