import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class FindAllDuplicates {
    
    public static List<Integer> findDuplicates(int[] arr){
        List<Integer> duplicates = new ArrayList<>();

        for(int i =0; i<arr.length; i++){
            int index = Math.abs(arr[i]) - 1;

            if(arr[index] < 0){
                duplicates.add(index + 1);
            }

            arr[index] = - arr[index];
        }
        return duplicates;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = scn.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements of an array");
        for(int i =0; i<n; i++){
            arr[i] = scn.nextInt();
        }
        List<Integer> result = findDuplicates(arr);
        System.out.println("Duplicates " + result);
    }
}
