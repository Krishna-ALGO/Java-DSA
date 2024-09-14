import java.util.Scanner;
public class JosephusProblem {
    public static int josephus(int n , int k){
        if(n ==  1){
            return 0; 
        }
        return (josephus(n-1, k) + k ) % n;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the number of people(n) :");
        int n = scn.nextInt();
        System.out.println("Enter the step count (k) :");
        int k = scn.nextInt();

        int safePosition = josephus(n , k) + 1;
        System.out.println("The safe position is : " + safePosition);
        
    }
}
