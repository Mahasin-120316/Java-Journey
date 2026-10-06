package Week09;

import java.util.Scanner;

class ChainedStudent {
    private String name;
    private int age;

    ChainedStudent(String name) {
        this(name, 18);
    }

    ChainedStudent(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println(name + " " + age);
    }
}

public class Chain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        ChainedStudent student = new ChainedStudent(name);
        student.display();
        scanner.close();
    }
}
