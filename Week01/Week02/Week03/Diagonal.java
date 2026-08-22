 import java.util.Scanner;
public class Diagonal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum = sum + arr[i][i];
        }

        System.out.println("Diagonal Sum = " + sum);
        sc.close();
    }
}

