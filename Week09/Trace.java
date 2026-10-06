package Week09;
import java.util.Scanner;
class TracePerson {
    String name;
    TracePerson(String name) {
        System.out.println("Person: " + name);
    }

}

class TraceStudent extends TracePerson {
    TraceStudent(String name) {
        super(name);
        System.out.println("Student created");
    }
}

public class Trace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        TraceStudent s = new TraceStudent(name);
        scanner.close();
    }
}
