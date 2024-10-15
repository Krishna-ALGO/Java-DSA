import java.util.Stack;
public class PreviousSmallerElement {
    public static int[] prevSmallerElements(int[] arr){
        int n = arr.length;
        int[] res = new int[n];

        Stack<Integer> st = new Stack<>();
        for(int i = 0; i<n; i++){
            while(!st.isEmpty() && st.peek() >= arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                res[i] = -1;
            }else{
                res[i] = st.peek();
            }
            st.push(arr[i]);
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr = {1,5,3,2,1,6,3,4};
        int[] res = prevSmallerElements(arr);
        for(int val : res){
            System.out.print(val + " ");
        }
        System.out.println();

    }
}
