import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter an number:");
        int num = scn.nextInt();
        int fact = 1;

        if(num ==0 || num == 1){
            fact = 1;
         }else{
            for(int i = 1 ; i<= num ; i++){
                fact *= i;
            }
        }
        System.out.println("The Factorial of " + 
            num + " is: " + fact);
    }
}
