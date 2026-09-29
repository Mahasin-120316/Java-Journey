package Week08;
import java.util. Scanner;
class Student {
    private int marks;
    public boolean setMarks(int marks) {
        if(marks >= 0 && marks <= 100){
            this.marks = marks;
            return true;
        }
        return false;
    }
    public int getMarks() {
        return this.marks;
    }
}
public class Hello {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int marks = scanner.nextInt();
        Student s = new Student();
        if(s.setMarks (marks) ) {
            System.out.println("Marks obtained are: " + s.getMarks());
        } else{
            System.out.println("Invalid marks");
        }
        scanner.close();
    }
}