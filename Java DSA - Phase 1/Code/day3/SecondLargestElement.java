import java.util.Scanner;
public class SecondLargestElement {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        
        int n = scn.nextInt();
        int[] arr = new int[n];
        
        System.out.println("Enter the Element of an array");

        for(int i = 0; i<n; i++){
            arr[i] = scn.nextInt();
        }

        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for(int i =0; i<n; i++){
            if(arr[i] > firstMax){
                secondMax = firstMax;
                firstMax = arr[i];
            }else if(arr[i] > secondMax && arr[i] < firstMax){
                secondMax = arr[i];
            }
        }

        System.out.println("Second largest Element is :" + secondMax);
    }
}
