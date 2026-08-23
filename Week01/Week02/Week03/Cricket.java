import java.util.Scanner;
public class Cricket {
public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int teams = 2;
        int matches = 2;
        int players = 3;

        int[][][] runs =
                new int[teams][matches][players];

        int highest = Integer.MIN_VALUE;

        for (int i = 0; i < teams; i++) {
            for (int j = 0; j < matches; j++) {
                for (int k = 0; k < players; k++) {

                    System.out.print("Enter runs: ");
                    runs[i][j][k] = sc.nextInt();

                    if (runs[i][j][k] > highest) {
                        highest = runs[i][j][k];
                    }
                }
            }
        }

        System.out.println("Highest Individual Score = " + highest);
        sc.close();
    }
}
