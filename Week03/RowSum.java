
    import java.util.Scanner;
    public class RowSum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows and columns: ");
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] arr = new int[rows][cols];
        System.out.println("Enter the elements: ");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < rows; i++) {

            int sum = 0;

            for (int j = 0; j < cols; j++) {
                sum = sum + arr[i][j];
            }

            System.out.println("Row " + (i + 1) + " Sum = " + sum);
        }
        sc.close();
    }
}

