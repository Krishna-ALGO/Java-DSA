import java.io.*;
import java.util.Scanner;

public class Main {

    public static int maxElementInArray(int[] arr,int n){
        if(n-1==0)
        {
            return arr[0];
        }
        else
        {
            return Math.max(arr[n-1],maxElementInArray(arr,n-1));
        }

    }

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++)
        {
            nums[i] = sc.nextInt();
        }
        int ans=maxElementInArray(nums,n);
        System.out.print(ans);
    }
}