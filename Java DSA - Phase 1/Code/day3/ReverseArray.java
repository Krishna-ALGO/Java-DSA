public class ReverseArray {
    public static void main(String[] args) {
        
        int[] arr = {1,2,3,4,5};
        int n = arr.length;
        for(int i = 0 ; i< n/2; i++){
            int temp = arr[i];
            arr[i] = arr[n-1-i];
            arr[n-1-i] = temp;
        }

        // Traverse the reverse array to print the elements.
        for(int i =0 ; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
