import java.util.Scanner;
public class GradingSystem {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the Student's Score :");
        int score = scn.nextInt();
        char grade;
        if(score >=90){
            grade = 'A';
        }else if(score >=80){
            grade = 'B';
        }else if(score >=70){
            grade = 'C';
        }else if(score >=60){
            grade = 'D';
        }else{
            grade = 'F';
        }
        
        System.out.println("The Student's grade is : " + grade);
    }
}
