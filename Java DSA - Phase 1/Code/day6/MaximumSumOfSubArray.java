import java.util.Scanner;
public class MaximumSumOfSubArray {
    public static int findMaxSubarraySum(int[] arr){
        int maxSum = arr[0];
        int currentSum = arr[0];

        for(int i = 1; i< arr.length; i++){
            currentSum = Math.max(arr[i], currentSum + arr[i]);
            maxSum = Math.max(maxSum , currentSum);
        }
        return maxSum;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number of Elements  in  the array : ");

        int n = scn.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of an array : ");
        for(int i = 0 ; i < n ; i++){
            arr[i] = scn.nextInt();
        }
        int maxSum = findMaxSubarraySum(arr);
        System.out.println(maxSum);
    }
}
