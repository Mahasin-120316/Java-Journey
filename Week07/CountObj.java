package Week07;
import java.util.Scanner;
class Student {
    static int count = 0;
    Student() {
        count++;
    }
}

public class CountObj {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfStudents = scanner.nextInt();
            for(int i = 0; i < numberOfStudents; i++){
            new Student();
        }
        System.out.println("Created students: " + Student.count);
        scanner.close();
    }
}