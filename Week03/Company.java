import java.util.Scanner;
public class Company {

public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int departments = 2;
        int teams = 2;
        int employees = 3;

        double[][][] salary =
                new double[departments][teams][employees];

        double highest = Double.MIN_VALUE;

        for (int i = 0; i < departments; i++) {
            for (int j = 0; j < teams; j++) {
                for (int k = 0; k < employees; k++) {

                    System.out.print("Enter salary: ");
                    salary[i][j][k] = sc.nextDouble();

                    if (salary[i][j][k] > highest) {
                        highest = salary[i][j][k];
                    }
                }
            }
        }

        System.out.println("Highest Salary = " + highest);
        sc.close();
    }
}

