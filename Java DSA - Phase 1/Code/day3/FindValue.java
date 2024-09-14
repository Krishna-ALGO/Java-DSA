public class FindValue {
    public static void main(String[] args) {
        int[] arr = {3,5,2,8,1};
        int value = 8;
        boolean found = false;

        for(int i =0; i< arr.length ; i++){
            if(arr[i] == value){
                found = true;
                break;
            }
        }
        if(found){
            System.out.println("Value found");
        }else{
            System.out.println("Value not found");
        }
    }
}
