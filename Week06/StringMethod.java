package Week06;
import java.util.Scanner;

public class StringMethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();
        String keyword = scanner.nextLine();

        // Normalize both values and search for the keyword.
        String normalizedSentence = sentence.trim().toLowerCase();
        String normalizedKeyword = keyword.trim().toLowerCase();

        boolean containsKeyword = normalizedSentence.contains(normalizedKeyword);

        System.out.println("Normalized text: " + normalizedSentence);
        System.out.println("Contains keyword: " + containsKeyword);
        scanner.close();
    }
}