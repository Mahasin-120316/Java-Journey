
import java.util.Scanner;

public class Learner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fname = scanner.nextLine();
        int solvedProblems = scanner.nextInt();
        double assessmentPercentage = scanner.nextDouble();

        System.out.println("Learner: " + fname);
        System.out.println("Problems Solved: " + solvedProblems);
        System.out.println("Assessment: " + assessmentPercentage);

    }
}
