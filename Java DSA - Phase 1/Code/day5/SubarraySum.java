import java.util.Scanner;
public class SubarraySum {
    public static int[] prefixSum(int[] arr){
        int n = arr.length;
        int[] prefix = new int[n];
        prefix[0] = arr[0];
        for(int i =1; i<n ; i++){
            prefix[i] = prefix[i-1] + arr[i];
        }
        return prefix;
    }
    public static int findSubarraySum(int[] prefix , int i , int j){
        if(i == 0){
            return prefix[j];
        }else{
            return prefix[j] - prefix[i-1];
        }
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int n = scn.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements of an array: ");
        for(int i =0 ; i<n ; i++){
            arr[i] = scn.nextInt();
        }
        int[] prefix = prefixSum(arr);
        System.out.println("Starting Index : ");
        int i = scn.nextInt();
        System.out.println("Ending Index : ");
        int j = scn.nextInt();
        int result = findSubarraySum(prefix , i ,j);
        System.out.println(result);
        
    }
}
