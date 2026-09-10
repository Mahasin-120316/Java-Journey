import java.util.Scanner;
public class Hotel {
public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int floors = 2;
        int rooms = 3;
        int sections = 2;

        int[][][] hotel =
                new int[floors][sections][rooms];

        int occupied = 0;

        for (int i = 0; i < floors; i++) {
            for (int j = 0; j < sections; j++) {
                for (int k = 0; k < rooms; k++) {

                    System.out.print("Enter 1 for occupied, 0 for empty: ");
                    hotel[i][j][k] = sc.nextInt();

                    if (hotel[i][j][k] == 1) {
                        occupied++;
                    }
                }
            }
        }

        System.out.println("Occupied Rooms = " + occupied);
        sc.close();
    }
}
