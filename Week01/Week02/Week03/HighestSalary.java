import java.util.Scanner;
public class HighestSalary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] salary = new int[n];

        for (int i = 0; i < n; i++) {
            salary[i] = sc.nextInt();
        }

        int highest = salary[0];

        for (int i = 1; i < n; i++) {
            if (salary[i] > highest) {
                highest = salary[i];
            }
        }

        System.out.println("Highest Salary: " + highest);
        sc.close();
    }
}