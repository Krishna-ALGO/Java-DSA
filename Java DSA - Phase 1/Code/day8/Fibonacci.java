import java.util.Scanner;
public class Fibonacci {
    public static int fibonacci(int num){
        if(num ==0){
            return 0;
        }else if(num == 1){
            return 1;
        }else{
            return fibonacci(num - 1) + fibonacci(num - 2);
        }
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the non-negative Integers : ");
        int num = scn.nextInt();
        int result = fibonacci(num);
        System.out.println(result);
    }
}

