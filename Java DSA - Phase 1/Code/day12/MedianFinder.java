import java.util.Arrays;
public class MedianFinder {
    public static double findMedian(int[] arr){
        Arrays.sort(arr);
        int n = arr.length;
        if(n % 2 !=0){
            return arr[n/2];
        }else{
            return (arr[n/2] + arr[(n/2)-1]) / 2.0;
        }
    }
    public static void main(String[] args) {
        int[] arr = {7,1,3,4,5,9};
        System.out.println("Median : " + findMedian(arr));
    }
}
