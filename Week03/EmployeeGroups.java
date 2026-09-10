import java.util.Scanner;
public class EmployeeGroups {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] id = new int[n];

        for (int i = 0; i < n; i++) {
            id[i] = sc.nextInt();
        }

        System.out.println("Even IDs:");

        for (int i = 0; i < n; i++) {
            if (id[i] % 2 == 0) {
                System.out.print(id[i] + " ");
            }
        }

        System.out.println("\n");

        System.out.println("Odd IDs:");

        for (int i = 0; i < n; i++) {
            if (id[i] % 2 != 0) {
                System.out.print(id[i] + " ");
            }
        }
        sc.close();
    }
}
