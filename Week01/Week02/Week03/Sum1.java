
    import java.util.Scanner;
    public class Sum1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows and columns: ");

        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] arr = new int[rows][cols];

        int sum = 0;
        System.out.println("Enter the elements: ");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
                sum = sum + arr[i][j];
            }
        }

        System.out.println("Sum = " + sum);
        sc.close();
    }
}
