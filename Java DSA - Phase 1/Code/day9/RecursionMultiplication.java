import java.util.Scanner;
public class RecursionMultiplication {
    public static int multiply(int a , int b){
        if(b == 0){
            return 0;
        }
        if(b > 0){
            return a + multiply(a, b-1);
        }
        return - multiply(a , -b);   
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the first number(a): " );
        int a = scn.nextInt();
        System.out.println("Enter the Second number(b): " );
        int b = scn.nextInt();

        int result = multiply(a,b);
        System.out.println("Result of " + a + " * " + b + " = " + result);
    }
}
