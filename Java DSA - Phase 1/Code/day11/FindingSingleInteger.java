public class FindingSingleInteger {

    public static int findSingleInteger(int[] nums){
        int result = 0;
        for(int num : nums){
            result ^= num;
        }
        return result;
    }
    public static void main(String[] args) {
        int[] nums1 = {2,2,1};
        int[] nums2 = {4,1,2,1,2};
        int[] nums3 = {7,8,7};

        System.out.println("Single Integer in nums1 : " + findSingleInteger(nums1));
        System.out.println("Single Integer in nums2 : " + findSingleInteger(nums2));
        System.out.println("Single Integer in nums3 : " + findSingleInteger(nums3));

    }
}
