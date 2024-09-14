public class LinearSearch {
    public static int linearSearch(int[] arr , int target){
        for(int i =0; i<arr.length  ; i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr= {10,20,30,40,50,60,70};
        int target = 50;
        int result = linearSearch(arr , target);
        if ((result == -1)) {
            System.out.println("Element Not Found");
        }else{
            System.out.println("Element Found at index : " + result);
        }
    }
}
