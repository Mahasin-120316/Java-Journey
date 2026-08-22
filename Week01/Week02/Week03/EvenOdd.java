import java.util.Scanner;
public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows and cols: ");

        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] arr = new int[rows][cols];

        int even = 0;
        int odd = 0;
        System.out.println("Enter the matrix elements: ");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {

                arr[i][j] = sc.nextInt();

                if (arr[i][j] % 2 == 0) {
                    even++;
                } else {
                    odd++;
                }
            }
        }

        System.out.println("Even = " + even);
        System.out.println("Odd = " + odd);
        sc.close();
    }
}

