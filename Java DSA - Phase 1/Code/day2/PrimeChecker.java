import java.util.Scanner;
public class PrimeChecker {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        boolean isPrime = true;
        if(num <=1){
            isPrime = false;
        }else{
            for(int i = 2; i <= Math.sqrt(num); i++){
                if(num % i ==0){
                    isPrime = false;
                    return;
                }
            }
        }

        if(isPrime){
            System.err.println(num + " is a prime number.");
        }else{
            System.err.println(num + " is not a prime number.");
        }
    }
}
