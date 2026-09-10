import java.util.Scanner;
public class Hospital {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int floors = 2;
        int rooms = 2;
        int patients = 3;

        double[][][] temperature =
                new double[floors][rooms][patients];

        double highest = Double.MIN_VALUE;

        for (int i = 0; i < floors; i++) {
            for (int j = 0; j < rooms; j++) {
                for (int k = 0; k < patients; k++) {

                    System.out.print("Enter patient temperature: ");
                    temperature[i][j][k] = sc.nextDouble();

                    if (temperature[i][j][k] > highest) {
                        highest = temperature[i][j][k];
                    }
                }
            }
        }

        System.out.println("Highest Temperature = " + highest);
        sc.close();
    }
}
