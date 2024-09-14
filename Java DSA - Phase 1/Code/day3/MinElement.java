public class MinElement {
    public static void main(String[] args) {
        int[] arr = {3,5,2,8,1};

        int min = arr[0];
        for(int i = 1; i<arr.length ; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("Min Element in an array : " + min);
    }
}
