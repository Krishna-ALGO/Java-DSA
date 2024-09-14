import java.util.Arrays;
import java.util.Scanner;
public class BoatsToSavePeople {

    public static int CountOfBoat(int[] people , int limit){
        Arrays.sort(people);
        int left = 0;
        int right = people.length - 1;
        int boats = 0;
        while(left <= right){
            if(people[left] + people[right] <= limit){
                left++;
            }
            right--;
            boats++;
        }
        return boats;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number of People :");
        int n = scn.nextInt();

        int[] people = new int[n];
        System.out.println("Enter the Weights of the people");

        for(int i =0 ; i<n ; i++){
            people[i] = scn.nextInt();
        }

        System.out.println("Enter the boat weight Limits : ");
        int limit  = scn.nextInt();

        int result = CountOfBoat(people , limit);
        System.out.println(result);
    }
}
