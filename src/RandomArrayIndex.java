import java.util.Random;
import java.util.Scanner;

public class RandomArrayIndex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int[] array = new int[100];
        for (int i = 0; i < 100; i++) {
            array[i] = random.nextInt(100);
        }

        System.out.print("Enter the index (0-99) to retrieve the element: ");
        try {
            int index = scanner.nextInt();
            int element = array[index];
            System.out.println("Element at index " + index + " is: " + element);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Out of Bounds");
        }

        scanner.close();
    }
}
