import java.util.Scanner;
public class BonusEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] years = new int[n];

        int count = 0;

        for (int i = 0; i < n; i++) {
            years[i] = sc.nextInt();

            if (years[i] > 5) {
                count++;
            }
        }

        System.out.println("Employees eligible for bonus: " + count);
        sc.close();
    }
}
