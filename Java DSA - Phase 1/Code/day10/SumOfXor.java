public class SumOfXor {

    public static int sumofXOR(int[] arr){
        int sum = 0;
        int n = arr.length;
        for(int i =0 ; i < n; i++){
            for(int j = i+1 ; j<n; j++){
                sum += arr[i] ^ arr[j];
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        System.out.println(sumofXOR(arr));
    }
}
