
import java.util.Scanner;

class PracticeProfile {

    String name;
    int points;
}

public class Practice {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        int startingPoints = scanner.nextInt();
        int boostPoints = scanner.nextInt();
        int correctionPoints = scanner.nextInt();

        PracticeProfile live = new PracticeProfile();
        live.name = name;
        live.points = startingPoints;
        PracticeProfile alias = live;
        alias.points = alias.points + boostPoints;
        if (alias.points > 100) {
            alias.points = 100;
        }
        PracticeProfile checkpoint = new PracticeProfile();
        checkpoint.name = live.name;
        checkpoint.points = live.points;
        live.points = live.points - correctionPoints;
        if (live.points < 0) {
            live.points = 0;
        }
        System.out.println("Live : " + name + " " + live.points);
        System.out.println("Alias : " + name + " " + alias.points);
        System.out.println("Checkpoint : " + name + " " + checkpoint.points);

        scanner.close();
    }
}
