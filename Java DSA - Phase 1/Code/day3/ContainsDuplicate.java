import java.util.Scanner;
public class ContainsDuplicate {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the size of an array: " );

        int n = scn.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the Element of an array:");
        for(int i =0 ; i<n ; i++){
            arr[i] = scn.nextInt();
        }

        // check for duplicate.
        boolean foundDuplicate = false;
        for(int i=0 ; i< n - 1; i++){
            for(int j = i+1; j<n ; j++){
                if(arr[i] == arr[j]){
                    foundDuplicate = true;
                    break;
                }
            }
        }

        if(foundDuplicate){
            System.out.println("Duplicates Found");
        }else{
            System.out.println("No Duplicates");
        }
    }
}
