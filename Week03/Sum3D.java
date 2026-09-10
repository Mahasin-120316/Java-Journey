
    import java.util.Scanner;
    public class Sum3D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the layers, rows and cols: ");
        int layers = sc.nextInt();
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][][] arr = new int[layers][rows][cols];

        int sum = 0;
        System.out.println("Enter the matrix elements: ");
        for (int i = 0; i < layers; i++) {
            for (int j = 0; j < rows; j++) {
                for (int k = 0; k < cols; k++) {

                    arr[i][j][k] = sc.nextInt();

                    sum = sum + arr[i][j][k];
                }
            }
        }

        System.out.println("Total Sum = " + sum);
        sc.close();
    }
}
