import java.util.Scanner;
public class PivotIndex {
    public static int findPivotIndex(int[] arr){
        int totalSum = 0;
        int leftSum = 0;

        for(int num : arr){
            totalSum += num;
        }

        for(int i=0 ; i<arr.length ; i++){
            int rightSum = totalSum - leftSum - arr[i];

            if(leftSum == rightSum){
                return i; // pivot Index or Equilibrium index
            }
            leftSum +=arr[i];
        }
        return -1; // No pivot index found
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
        int pivotIndex = findPivotIndex(arr);

        if(pivotIndex != -1){
            System.out.println("The pivot Index is " + pivotIndex);
        }else{
            System.out.println("No Pivot Index Found.");
        }
    }
}
