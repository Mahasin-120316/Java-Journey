package Week09;
import java.util. Scanner;
class ReusePerson {
private String name;
public void setName(String name){
    this. name = name;
}

public String getName(){
    return name;
}
}
class ReuseEmployee extends ReusePerson {
}
public class Reuse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        ReuseEmployee emp = new ReuseEmployee();
        emp. setName (name);
        System.out.println(emp.getName());
        scanner.close();
    }
}
