package Week09;

import java.util.Scanner;

class DemoPerson {
    private String name;

    DemoPerson(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class DemoStudent extends DemoPerson {
    private int marks;

    DemoStudent(String name, int marks) {
        super(name);
        this.marks = marks;
    }

    public void display() {
        System.out.println(getName() + " " + marks);
    }
}

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        int marks = scanner.nextInt();
        DemoStudent s = new DemoStudent(name, marks);
        s.display();
        scanner.close();
    }
}

