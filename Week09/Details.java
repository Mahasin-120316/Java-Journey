package Week09;
import java.util.Scanner;

class Person {
    String name;
    int age;

    void displayPerson() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Student extends Person {
    int rollNo;

    void displayStudent() {
        displayPerson();
        System.out.println("Roll No: " + rollNo);
    }
}

public class Details {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student s = new Student();

        s.name = sc.nextLine();
        s.age = sc.nextInt();
        s.rollNo = sc.nextInt();

        s.displayStudent();
    }
}