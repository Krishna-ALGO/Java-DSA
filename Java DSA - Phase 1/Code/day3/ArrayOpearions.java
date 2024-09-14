import java.util.Scanner;
public class ArrayOpearions {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the size of an array: ");

        int n = scn.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of an array:");
        for(int i=0 ; i <n; i++){
            arr[i] = scn.nextInt();
        }

        int sum =0;
        int product = 1;

        for(int i=0; i<n; i++){
            sum += arr[i];
            product *= arr[i];
        }

        double average = (double) sum / n;

        System.out.println(sum);
        System.out.println(product);
        System.out.println(average);
    }
}
