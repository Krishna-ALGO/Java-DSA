import java.util.Scanner;
public class PowerLinear {

    public static int power(int x , int n){
        if(n ==0){
            return 1;
        }
        int result = power(x, n-1);
        return x * result;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the base (x) : ");
        int x = scn.nextInt();
        System.out.println("Enter the exponent (n) : ");
        int n = scn.nextInt();

        int result = power(x , n);
        System.out.println( x + " ^ " + n + " = " + result);
    }
    
}
