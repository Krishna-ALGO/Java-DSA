import java.util.Scanner;
public class SubarrayProductLessThanK {

    public static int numSubarrayProductLessThanK(int[] nums , int k){
        if(k <= 1) return 0;
        int product = 1;
        int count = 0;
        int left = 0;
        for(int right = 0 ; right < arr.length; right++){
            product *= arr[right];
            while(product >=k){
                product /= arr[left];
                left++;
            }
            count += right - left + 1;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements of an array");
        for(int i =0; i<n; i++){
            arr[i] = scn.nextInt();
        }

        System.out.println("Enter the Value of K :");
        int k = scn.nextInt();

        int result = numSubarrayProductLessThanK(arr , k);
        System.out.println(result);
    }
}
