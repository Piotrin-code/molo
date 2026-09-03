import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) throws Exception {
        try (Scanner input = new Scanner(System.in)) {
           
            System.out.print("number 2: ");
            int number2 = input.nextInt();

            System.out.print("number 1: ");
            int number1 = input.nextInt();

            int sum = number1 + number2;
            int minus = number1 - number2;
            int times = number1 * number2;
            int devided = number1 / number2;

            System.out.println("number 1 is " + number1);
            System.out.println("number 2 is " + number2);
            System.out.println("Sum: " + sum);
            System.out.println("subtraction: " + minus);
            System.out.println("multiplication: " + times);
            System.out.println("devination: " + devided);

        }
    }
}
