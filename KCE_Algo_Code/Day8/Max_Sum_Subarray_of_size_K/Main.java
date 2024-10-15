import java.util.*;
class Solution{
    public static int maxSubSize(int[] arr , int k){
        //Write your code here
        if(k<=0)
        return 0;
	   int sum=0;
	   int n=arr.length;
	   for(int i=0;i<k;i++)
	   sum+=arr[i];
	   int maxSum=sum;;
	   for(int i=k;i<n;i++){
	       sum+=arr[i]-arr[i-k];
	       maxSum=Math.max(sum,maxSum);
	   }
	   return maxSum;
    }
		
}

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[]arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(Solution.maxSubSize(arr,k));
    }
}
