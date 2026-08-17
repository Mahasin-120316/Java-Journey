import java.util.Scanner;
 public class Printer {
    void show(int number){
        System.out.println("Number: " + number);
    }

    void show(String name){
        System.out.println("Name: " + name);
    }
}
class Printer1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        sc.nextLine();
        String name = sc.nextLine();

        Printer p1 = new Printer();
        p1.show(number);
        p1.show(name);

        sc.close();
    }
}