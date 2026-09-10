
import java.util.Scanner;

class Main {

    int id;
    String name;
    int javaScore;
}

public class Student {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // First student 
        Student s1 = new Student();
        s1.id = scanner.nextInt();
        s1.name = scanner.next();
        s1.javaScore = scanner.nextInt();
        // Second student

        Student s2 = new Student();
        s2.id = scanner.nextInt();
        s2.name = scanner.next();
        s2.javaScore = scanner.nextInt();
        // Print both records 
        System.out.println(s1.id + " - " + s1.name + " - " + s1.javaScore);
        System.out.println(s2.id + " - " + s2.name + " - " + s2.javaScore);
        // Compare scores 
        if (s1.javaScore > s2.javaScore) {
            System.out.println(s1.name + " has the higher Java score.");
        } else if (s2.javaScore > s1.javaScore) {
            System.out.println(s2.name + " has the higher Java score.");
        } else {
            System.out.println("Both students have the same Java score.");
        }

        scanner.close();
    }
}
