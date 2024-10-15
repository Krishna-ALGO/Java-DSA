
import java.util.*;
import java.util.Scanner;

public class Main{
    static void printAllSubsequence(String s,int i,StringBuilder str) {
        //Write your code here
        if(s.length()<=i){
            System.out.print(str+" ");
            return;
        }
        str.append(s.charAt(i));
        printAllSubsequence(s,i+1,str);
        str.deleteCharAt(str.length()-1);
        printAllSubsequence(s,i+1,str);
    }
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        printAllSubsequence(str,0,new StringBuilder());
    }
}