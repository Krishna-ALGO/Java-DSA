public class TwoSum {

    public static int[] twoSum(int[] arr , int target){
        int left = 0;
        int right = arr.length - 1;

        while(left < right){
            int sum = arr[left] + arr[right];
            if(sum == target){
                return new int[] {left , right};
            }else if(sum < target){
                left++;
            }else{
                right--;
            }
        }
        return new int[] {};
    }
    public static void main(String[] args) {
        int[] arr = {2 , 7 , 11 ,15};
        int target = 9;
        int[] result = twoSum(arr , target);

        if(result.length > 0){
            System.out.println("Indices of the 2 numbers are : "+
            result[0] + " and " + result[1]);
        }else{
            System.out.println("No 2Sum solution found");
        }
    }
}
