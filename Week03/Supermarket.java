import java.util.Scanner;
public class Supermarket {
public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int branches = 2;
        int sections = 2;
        int days = 3;

        double[][][] sales =
                new double[branches][sections][days];

        double totalSales = 0;

        for (int i = 0; i < branches; i++) {
            for (int j = 0; j < sections; j++) {
                for (int k = 0; k < days; k++) {

                    System.out.print("Enter sales amount: ");
                    sales[i][j][k] = sc.nextDouble();

                    totalSales = totalSales + sales[i][j][k];
                }
            }
        }

        System.out.println("Total Sales = " + totalSales);
        sc.close();
    }
}
