import java.util.Scanner;
public class LastDigitChecker {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter a number");
        int num = scn.nextInt();

        int lastDigit = num % 10;

        if(lastDigit %2 == 0){
            System.out.println("The last digit is even");
        }else{
            System.out.println("The last digit is odd");
        }
    }
}
