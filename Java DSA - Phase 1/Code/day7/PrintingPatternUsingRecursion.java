import java.util.Scanner;
public class PrintingPatternUsingRecursion {

    public static void printPattern(int n){
        if(n > 0){
            
            System.out.println(n);
            printPattern(n-1);
            System.out.println(n);
        }
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the Value to print in a pattern : ");

        int n = scn.nextInt();

        printPattern(n);

    }
}
