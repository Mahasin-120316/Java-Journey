package Week07;
import java.util.Scanner;

class Calculator {
    static int add(int first, int second) {
        return first + second;
    }
}
public class Cal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int result = Calculator.add(num1, num2);
        System.out.println("Sum: " + result);
        scanner.close();
    }
}