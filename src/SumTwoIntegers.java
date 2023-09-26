import java.util.Scanner;

public class SumTwoIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1, num2, sum;

        while (true) {
            try {
                System.out.print("Enter the first integer: ");
                num1 = scanner.nextInt();
                System.out.print("Enter the second integer: ");
                num2 = scanner.nextInt();

                sum = num1 + num2;
                System.out.println("Sum: " + sum);

                break;
            } catch (java.util.InputMismatchException e) {
                System.out.println("Invalid input. Please enter integers only.");
                scanner.nextLine();
            }
        }

        scanner.close();
    }
}
