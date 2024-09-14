import java.util.Scanner;
public class DisplayArray {

    public static void displayArray(int[] arr , int idx){
        if(idx == arr.length){
            return;
        }

        System.out.println(arr[idx]);
        displayArray(arr, idx+1);
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
        System.out.println("Array Elemets are : ");
        displayArray(arr, 0);
    }
}
