import java.util.*;
import java.io.*;

class Solution{
    public static int longestContinuousInc(int[] arr) {
        //Write your code here
        int n=arr.length;
        if(n==1)
        return 1;
        int max=0,count=1,prev=arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]>prev)
            count++;
            else
            count=1;
            max=Math.max(max,count);
            prev=arr[i];
        }
        return max;

    }
}
public class Main {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int a[] = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = input.nextInt();
        }
        Solution obj= new Solution();
        System.out.println(obj.longestContinuousInc(a));
    }
}
