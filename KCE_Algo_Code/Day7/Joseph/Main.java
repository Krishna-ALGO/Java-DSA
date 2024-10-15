import java.util.*;
import java.io.*;

class Solution{
    static int solve(int a,int b){
        //Write code here
      if(a==1)
          return 0;
      else
          return (solve(a - 1 , b) + b) % a;
  }
 }

public class Main {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(Solution.solve(a,b)+1);
    }
}
