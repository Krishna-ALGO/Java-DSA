import java.util.*;

class Solution {
    public void printSingleElement(int[]A,int n) {
        //Write code here
         int sum=0;
         for(int i=0;i<n;i++){
             sum=A[i]^sum;
         }
         System.out.print(sum);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int[] A = new int[n];
        for (int i = 0; i < n; i++)
                A[i] = sc.nextInt();
        Solution Obj = new Solution();
        Obj.printSingleElement(A,n);
        sc.close();
    }
}

