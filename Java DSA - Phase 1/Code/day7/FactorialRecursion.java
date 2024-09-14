import java.util.Scanner;
public class FactorialRecursion {
    public static int factorial(int n){
        if(n == 0){
            return 1;
        }else{
            return n * factorial(n - 1);
        }
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int fact = factorial(num);
        System.out.println(fact);
    }
}
