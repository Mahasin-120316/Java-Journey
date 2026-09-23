package Week07;
import java.util.Scanner;

public class Math {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int maxVal = java.lang.Math.max(a, b);
        int minVal = java.lang.Math.min(a, b);
        int absVal = java.lang.Math.abs(a);

        System.out.println("Maximum: " + maxVal);
        System.out.println("Minimum: " + minVal);
        System.out.println("Absolute first: " + absVal);
        scanner.close();
    }
}
