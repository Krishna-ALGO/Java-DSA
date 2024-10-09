
import java.io.*;
import java.util.*;

 public class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int n=sc.nextInt();

        solve("ALGOTUTOR",n);

    }

    public static void solve(String s,int n){
        if(n>0)
        {
            System.out.println(s);
            solve(s,n-1);
            
        }
        
       
    }
}