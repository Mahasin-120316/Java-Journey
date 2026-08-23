import java.util.Scanner;
public class Shopping {
public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int warehouses = 2;
        int categories = 2;
        int products = 3;

        int[][][] stock =
                new int[warehouses][categories][products];

        int totalStock = 0;

        for (int i = 0; i < warehouses; i++) {
            for (int j = 0; j < categories; j++) {
                for (int k = 0; k < products; k++) {

                    System.out.print("Enter product quantity: ");
                    stock[i][j][k] = sc.nextInt();

                    totalStock += stock[i][j][k];
                }
            }
        }

        System.out.println("Total Stock = " + totalStock);
        sc.close();
    }
}

