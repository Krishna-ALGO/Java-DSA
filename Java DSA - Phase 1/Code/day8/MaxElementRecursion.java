import java.util.Scanner;
public class MaxElementRecursion {

    public static int FindMax(int[] arr , int left , int right){
        if(left == right){
            return arr[left]; // or arr[right] both are pointing to same value.
        }
        int mid = (left + right) /2;
        int leftMax = FindMax(arr, left , mid);
        int rightMax = FindMax(arr, mid + 1, right);
        return Math.max(leftMax, rightMax);
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the size of an array : ");
        int n = scn.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements of an array:");
        for(int i = 0 ; i< n; i++){
            arr[i] = scn.nextInt();
        }

        int max = FindMax(arr , 0 , n -1);
        System.out.println("The maximum element of an array is : " + max);
    }
}
