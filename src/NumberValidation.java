import java.util.Scanner;
public class NumberValidation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hi, Please enter a number between 0 and 10!: ");
        int enteredNumber = scanner.nextInt();
        assert (enteredNumber >= 0 && (enteredNumber <= 10)) : "I told you to enter between 0 and 10. So your entered number is out of range";
        System.out.println("You entered: " + enteredNumber);
        scanner.close();
    }
}


