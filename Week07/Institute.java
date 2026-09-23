package Week07;
import java.util.Scanner;
    class Learner {
        String learnerName;
        static String instituteName;
        Learner(String learnerName) {
            this.learnerName = learnerName;
        }
        void display() {
            System.out.println(learnerName + " - " + instituteName);
        }
    }
    public class Institute {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Learner.instituteName = scanner.nextLine();
        String name1 = scanner.nextLine();
        String name2 = scanner.nextLine();
        Learner l1 = new Learner(name1);
        Learner l2 = new Learner(name2);
        l1.display();
        l2.display();
        scanner.close();
    }
}

