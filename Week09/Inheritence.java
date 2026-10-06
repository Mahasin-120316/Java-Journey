package Week09;
class Person {
    String name;
    int age;
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    void read() {
        System.out.println("Reading");
    }
}

class Student extends Person {
    int rollNo;
    Student(String name, int age, int rollNo) {
        super(name, age);
        this.rollNo = rollNo;
    }
    void write() {
        System.out.println("Writing");
    }
}

public class Inheritence {
    public static void main(String[] args) {
        Student s = new Student("John", 20, 101);
        s.read();
        s.write();
    }
}
