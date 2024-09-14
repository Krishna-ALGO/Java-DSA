import java.util.Scanner;
public class EvenOddChecker {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter a Number:");
        int num = scn.nextInt();

        if(num % 2 ==0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }
}
