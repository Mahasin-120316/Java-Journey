package Week06;

import java.util.Scanner;
public class OriginalText {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String original = scanner.nextLine();
        String lowerCase = original. toLowerCase();
        System.out.println("Original: " + original);
        System.out.println("Lowercase copy: " + lowerCase);
        scanner.close();
    }
}
