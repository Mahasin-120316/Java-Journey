package Week07;
import java.util.Scanner;
class Course {
    static {
        System.out.println("Course class initialized");
    }
    Course(String name) {
        System.out.println("Created: " + name);
    }
}
public class Course2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String courseName = scanner.nextLine();
        new Course(courseName);
        scanner.close();
    }
}
