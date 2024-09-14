public class ValidSquare {
    public static String validatePerfectSquare(int num){
        int low = 1;
        int high = num;

        while(low <= high){
            int mid = (low + high)/2;
            int midSquared = mid * mid;

            if(midSquared == num){
                return "Yes";
            }else if(midSquared > num){
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return "No";
    }
    public static void main(String[] args) {
        int n1 = 16;
        System.out.println(validatePerfectSquare(n1));
        int n2 = 14;
        System.out.println(validatePerfectSquare(n2));
    }
}
