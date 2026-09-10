
import java.util.Scanner;
public class ATM {

public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int branches = 2;
        int atms = 2;
        int transactions = 3;

        double[][][] withdrawals =
                new double[branches][atms][transactions];

        double total = 0;

        for (int i = 0; i < branches; i++) {
            for (int j = 0; j < atms; j++) {
                for (int k = 0; k < transactions; k++) {

                    System.out.print("Enter withdrawal amount: ");
                    withdrawals[i][j][k] = sc.nextDouble();

                    total = total + withdrawals[i][j][k];
                }
            }
        }

        System.out.println("Total Withdrawn Amount = " + total);
        sc.close();
    }
}
