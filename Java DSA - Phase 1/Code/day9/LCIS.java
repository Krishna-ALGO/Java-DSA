public class LCIS {
    public static int FindLengthOfLCIS(int[] nums){
        if(nums.length == 0){
            return 0;
        }
        int maxLength = 1;
        int currentLength = 1; 
        for(int i = 1; i<nums.length; i++){
            if(nums[i] > nums[i-1]){
                currentLength++;
                maxLength = Math.max(maxLength, currentLength);
            }else{
                currentLength = 1;
            }
        }
        return maxLength;
    }
    public static void main(String[] args) {
        int[] nums = {1 , 3, 5, 4 , 7};
        System.out.println(FindLengthOfLCIS(nums));
    }
}
