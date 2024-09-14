    import java.util.Scanner;
    public class MaximumOfThree {
        public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);

            System.out.println("Enter 3 numbers: ");

            int num1 = scn.nextInt();
            int num2 = scn.nextInt();
            int num3 = scn.nextInt();

            int max;

            if(num1 >= num2 && num1 >= num3){
                max = num1;
            }else if(num2 >= num1 && num2>=num3){
                max = num2;
            }else{
                max = num3;
            }

            System.out.println("The maximum number is " + max);
        }
    }
