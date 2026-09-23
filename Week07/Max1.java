package Week07;
import java.util.Scanner;
public class Max1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int maxVal = java.lang.Math.max(num1, num2);
        System.out.println("Maximum: " + maxVal);
        scanner.close();
    }
}
