package Week07;
import java.util.Scanner;
class NumberUtility {
    static int larger(int first, int second) {
        return java.lang.Math.max(first, second);
    }
}
public class LargeNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        int result = NumberUtility.larger(num1, num2);
        System.out.println("Larger: " + result);
        scanner.close();
    }
}
