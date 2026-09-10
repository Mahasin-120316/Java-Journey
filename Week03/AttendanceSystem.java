import java.util.Scanner;
public class AttendanceSystem {
public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int departments = 2;
        int teams = 2;
        int days = 3;

        int[][][] attendance =
                new int[departments][teams][days];

        int present = 0;

        for (int i = 0; i < departments; i++) {
            for (int j = 0; j < teams; j++) {
                for (int k = 0; k < days; k++) {

                    System.out.print("Enter 1 for Present, 0 for Absent: ");
                    attendance[i][j][k] = sc.nextInt();

                    if (attendance[i][j][k] == 1) {
                        present++;
                    }
                }
            }
        }

        System.out.println("Total Present Days = " + present);
        sc.close();
    }
}
