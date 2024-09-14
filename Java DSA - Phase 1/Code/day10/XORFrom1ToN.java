import java.util.Scanner;
public class XORFrom1ToN {
    public static int xorFrom1toN(int n){
        if(n % 4 ==0){
            return n;
        }else if(n% 4 == 1){
            return 1;
        }else if( n % 4 == 2){
            return n + 1;
        }else{
            return 0;
        }
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the value of N");
        int n = scn.nextInt();
        int result = xorFrom1toN(n);
        System.out.println("XOR From 1 to " + n + " is : " + result);
    }
}
