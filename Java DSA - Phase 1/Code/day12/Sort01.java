import java.util.Arrays;
public class Sort01 {
    public static void sort01(int[] arr){
        int left = 0;
        int right = arr.length - 1;
        while(left < right){
            if(arr[left] == 1 && arr[right] == 0){
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }
            if(arr[left] == 0){
                left++;
            }
            if(arr[right] == 1){
                right--;
            }            
        }
    }
    public static void main(String[] args) {
        int[] arr = {0,1,1,0,1,0};
        sort01(arr);
        System.out.println(Arrays.toString(arr));
    }
}
