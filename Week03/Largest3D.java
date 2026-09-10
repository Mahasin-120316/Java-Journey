
    import java.util.Scanner;
    public class Largest3D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter the layers, rows and cols: ");
        int layers = sc.nextInt();
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][][] arr = new int[layers][rows][cols];

        int max = Integer.MIN_VALUE;
        System.out.println("Enter the matrix elements: ");
        for (int i = 0; i < layers; i++) {
            for (int j = 0; j < rows; j++) {
                for (int k = 0; k < cols; k++) {

                    arr[i][j][k] = sc.nextInt();

                    if (arr[i][j][k] > max) {
                        max = arr[i][j][k];
                    }
                }
            }
        }

        System.out.println("Largest = " + max);
        sc.close();
    }
}

