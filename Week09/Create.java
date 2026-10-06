package Week09;
import java.util. Scanner;

class CreateAnimal {
    public void displayType(String type) {
        System.out.println(type);
    }
}
class CreateDog extends CreateAnimal {
}
public class Create {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String type = scanner.next();
        CreateDog d = new CreateDog();
        d.displayType(type);
        scanner.close();
}
}
