package Week06;

import java.util.Scanner;

public class TracingChanges {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String original = scanner.nextLine();
        String result = original.toUpperCase();
        System.out.println("Original: " + original);
        System.out.println("After ignored call: " + original);
        System.out.println("Uppercase copy: " + result);
    }
}