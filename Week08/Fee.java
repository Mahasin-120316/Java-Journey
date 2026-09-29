package Week08;
import java.util. Scanner;
class Course {
private double fee;
public Course(double fee) {
    this. fee = fee;
}
public double getFee(){
    return this.fee;
}
}
public class Fee {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double fee = scanner.nextDouble();
        Course c = new Course(fee);
        System.out.println(c.getFee());
        scanner.close();
    }
}
