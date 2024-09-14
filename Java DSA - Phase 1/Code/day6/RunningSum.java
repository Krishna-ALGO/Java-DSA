import java.util.Scanner;
import java.util.Arrays;
public class RunningSum {
    public static int[] runningSum(int[] nums){
        int n = nums.length;
        int[] runningSum = new int[n];

        if(n > 0){
            runningSum[0] =  nums[0];
            for(int i =1 ; i<n ; i++){
                runningSum[i] = runningSum[i-1] + nums[i];
            }
        }
        return runningSum;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number of Elements  in  the array : ");
        int n = scn.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the elements of an array : ");
        for(int i = 0 ; i < n ; i++){
            nums[i] = scn.nextInt();
        }
        int[] result = runningSum(nums);
        System.out.println("The running sum of an array : " + 
        Arrays.toString(result));
    }
}
