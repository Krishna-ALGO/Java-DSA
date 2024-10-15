import java.util.*;

class Solution{

    static int findHammingDistance(int a,int b){
        //write code here
        int res=a^b;
        int count=0;
        while(res>0){
            if(res%2==1)
            count++;
            res/=2;
        }
        return count; 
        
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        Solution obj = new Solution();
        int ans=obj.findHammingDistance(a,b);
        System.out.println(ans);
    }
}