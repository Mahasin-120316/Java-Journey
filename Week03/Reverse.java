package Week03;
import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: size
        int size = sc.nextInt();
        int[] arr = new int[size];

        // Input: array elements
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        // Input: target
        int target = sc.nextInt();

        // Search
        boolean found = false;
        for (int i = 0; i < size; i++) {
            if (arr[i] == target) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Found");
        } else {
            System.out.println("Not Found");
        }

        // Reverse display without modifying array
        System.out.print("Reverse order: ");
        for (int i = size - 1; i >= 0; i--) {
            System.out.print(arr[i]);
            if (i!= 0) {
                System.out.print(" ");
            }
        }

        sc.close();
    }
}

