import java.util.Scanner;
public class PowerLogarithmic {
    public static int power(int x , int n){
        if(n ==0){
            return 1;
        }
        int halfpower = power(x, n/2);
        if(n % 2 ==0){
            return halfpower * halfpower;
        }else{
            return x * halfpower * halfpower;
        }
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
