package Week03;
import java.util.Scanner;

public class Frequency1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int target = sc.nextInt();
        int count = 0;

        // One loop and one equality check as per constraint
        for (int i = 0; i < size; i++) {
            if (arr[i] == target) {
                count++;
            }
        }

        System.out.println("Frequency of " + target + ": " + count);

        sc.close();
    }
}

