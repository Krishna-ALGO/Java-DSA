import java.io.*;
import java.util.*;

public class Main {
    public static void multiplyRecursively(int a, int b) {
      System.out.println(a*b);
       
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        multiplyRecursively(a, b);
    }
}