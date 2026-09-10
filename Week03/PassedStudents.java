import java.util.Scanner;
public class PassedStudents {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] marks = new int[n];

        for (int i = 0; i < n; i++) {
            marks[i] = sc.nextInt();
        }

        int count = 0;

        for (int i = 0; i < n; i++) {
            if (marks[i] >= 40) {
                count++;
            }
        }

        System.out.println("Number of students passed: " + count);
        sc.close();
    }
}
