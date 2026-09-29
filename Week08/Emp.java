package Week08;
import java.util. Scanner;
class Employee {
    private int age;
    public boolean setAge(int age) {
    if(age >= 18 && age <= 60){
        this. age = age;
        return true;
    }
    return false;
    }
    public int getAge() {
    return age;
    }
}
public class Emp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        Employee e = new Employee();
        if(e.setAge(age)){
            System.out.println("Age is:"+e.getAge());
        } else {
            System.out.println("Invalid age");
        }
        scanner.close();
    }
}