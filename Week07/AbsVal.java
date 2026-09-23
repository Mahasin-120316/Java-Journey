package Week07;
import java.util.Scanner;
public class AbsVal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int absVal = java.lang.Math.abs(num);
        System.out.println("Absolute: " + absVal);
        scanner.close();
    }
}
