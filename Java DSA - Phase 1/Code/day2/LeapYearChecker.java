import java.util.Scanner;
public class LeapYearChecker {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a Year:");

        int year = scn.nextInt();
        if(year % 4 ==0){
            if(year % 100 ==0){
                if(year % 400 ==0){
                    System.out.println("Leap Year");
                }else{
                    System.out.println("Not a Leap Year");
                }
            }else{
                System.out.println("Leap Year");
            }
        }else{
            System.out.println("Not A Leap Year");
        }
    }
}
