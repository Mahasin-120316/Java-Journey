 import java.util.Scanner;
public class Array2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int layers = 2;
        int rows = 2;
        int cols = 3;

        int[][][] arr = new int[layers][rows][cols];

        // Reading
        for (int i = 0; i < layers; i++) {
            for (int j = 0; j < rows; j++) {
                for (int k = 0; k < cols; k++) {
                    arr[i][j][k] = sc.nextInt();
                }
            }
        }

        // Printing
        for (int i = 0; i < layers; i++) {

            System.out.println("Layer " + (i + 1));

            for (int j = 0; j < rows; j++) {

                for (int k = 0; k < cols; k++) {
                    System.out.print(arr[i][j][k] + " ");
                }

                System.out.println();
            }
        }
        sc.close();
    }
}
