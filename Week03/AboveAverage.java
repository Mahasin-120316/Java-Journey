import java.util.Scanner;
public class AboveAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] marks = new int[n];

        int sum = 0;

        for (int i = 0; i < n; i++) {
            marks[i] = sc.nextInt();
            sum += marks[i];
        }

        double average = (double) sum / n;

        int count = 0;

        for (int i = 0; i < n; i++) {
            if (marks[i] > average) {
                count++;
            }
        }

        System.out.println("Average: " + average);
        System.out.println("Students above average: " + count);
        sc.close();
    }
}

