import java.util.*;
 
public class Main {
    public static int minSubArrayLength(int arr[], int target, int n) {
        // write your code here
        int cur_sum=0;
        int min_length=n;
        int start=0,end=0;
        while(end<n){
            while(cur_sum<target && end<n){
                cur_sum+=arr[end++];
            }
            while(cur_sum>=target && start<n){
                min_length=Math.min(min_length,end-start);
                cur_sum-=arr[start++];
            }
        }
        return min_length;
        
    }
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int target = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(minSubArrayLength(arr, target, n));
    }
}
