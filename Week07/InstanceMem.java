package Week07;
import java.util.Scanner;
class Learner {
    String name;
    static String institute = "KodNest";
    Learner(String name) {
        this.name = name;
    }
    void displayName() {
        System.out.println("Learner: " + name + " ");
    }
    static void displayInstitute() {
        System.out.println("Institute: " + institute);
    }
}
public class InstanceMem {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String learnerName = scanner.nextLine();
    Learner learner = new Learner(learnerName);
    learner.displayName();
    Learner.displayInstitute();
    scanner.close();
    }
}
