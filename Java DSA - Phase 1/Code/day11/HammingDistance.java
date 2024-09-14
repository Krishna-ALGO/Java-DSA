import java.util.Scanner;
public class HammingDistance {

    public static int hammingDistance(int a , int b){
        int xorResult = a ^ b;
        int count = 0;

        while(xorResult > 0){
            count += xorResult & 1;
            xorResult >>=1;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the first Integer (a) :");
        int a = scn.nextInt();
        System.out.println("Enter the second Integer (b) :");
        int b = scn.nextInt();

        int result = hammingDistance(a,b);
        System.out.println("Hamming Distance between : " + a + " & " + b + " is : " + result);
    }
}
