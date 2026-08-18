package Week03;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        int[] numbers = new int[size];

        // Read the array
        for(int i = 0; i <= numbers.length-1; i++){
            numbers[i] = scanner.nextInt();
        }
        int target = scanner.nextInt();
        int replacement = scanner.nextInt();

        // Replace matches, count changes and display the result
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                // Count only if actually changed
                if (numbers[i]!= replacement) {
                    count++;
                }
                numbers[i] = replacement;
            }
        }

        System.out.println("Changes: " + count);
        System.out.print("Updated array: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
            if (i < numbers.length - 1) {
                System.out.print(" ");
            }
        }

        scanner.close();
    }
}