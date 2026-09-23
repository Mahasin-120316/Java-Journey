package Week07;
import java.util.Scanner;
public class Count2 {
    static class Student {
        String name;
        static int count;
        Student(String name) {
            this.name = name;
            count++;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name1 = scanner.nextLine();
        String name2 = scanner.nextLine();

        Student s1 = new Student(name1);
        Student s2 = new Student(name2);
        System.out.println("Student: " + s1.name);
        System.out.println("Student: " + s2.name);
        System.out.println("Total students: " + Student.count);
        scanner.close();
    }
}
