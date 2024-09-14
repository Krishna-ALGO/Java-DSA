import java.util.Scanner;
public class LastOccurenceIndex {
    public static int FindLastOccurence(int[] arr , int x){
        for(int i =arr.length-1; i>=0; i--){
            if(arr[i] == x){
                return i;
            }
        }
        return -1;
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

        System.out.println("Enter the element to find : ");
        int x = scn.nextInt();

        int index = FindLastOccurence(arr , x);
        
        if(index != -1){
            System.out.println("The last occurence of " + x + " is at index: " + index);
        }else{
            System.out.println(x + " is not present in an array");
        }
    }
}
