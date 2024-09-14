import java.util.Scanner;
public class NumberSignChecker {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();

        if(num > 0){
            System.out.println("Positive");
        }else if(num < 0) {
            System.out.println("Negative");
        }else{
            System.out.println("Zero");
        }
    }
}
