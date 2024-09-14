import java.util.Scanner;
public class CountOneSortedArray {

    public static int countOnes(int[] arr, int n){
        int low = 0;
        int high = n -1;
        int firstOneIndex = -1;

        while(low <= high){
            int mid = (low + high )/2;
            if(arr[mid] == 1){
                firstOneIndex = mid;
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        if(firstOneIndex == -1){
            return 0;
        }
        return n - firstOneIndex;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the size of an Array : ");
        int n = scn.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements of an array : ");
        for(int i =0 ; i<n ; i++){
            arr[i] = scn.nextInt();
        }

        int result = countOnes(arr , n);
        System.out.println("Count of 1's : " + result);
    }
}
