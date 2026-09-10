package Week06;

import java.util.Scanner;

public class TextMatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String expectedText = scanner.nextLine();
        String enteredText = scanner.nextLine();
        boolean res = expectedText.equals(enteredText);
        System.out.println("Match: " + res);
        scanner.close();
    }
}
