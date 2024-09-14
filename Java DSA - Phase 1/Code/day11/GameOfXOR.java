public class GameOfXOR {
    public static int gameofXOR(int[] arr){
        int totalXor = 0;
        int n = arr.length; 
        for(int i =0; i<n ; i++){
            for(int j = i; j< n ; j++){
                int xor = 0;
                for(int k = i ; k <=j; k++){
                    xor ^= arr[k];
                }
                totalXor ^= xor;
            }
        }
        return totalXor;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        System.out.println(gameofXOR(arr));
    }
}
