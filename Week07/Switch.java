package Week07;
import java.util.Scanner;
class Switch{
public static void main (String[] args){
    Scanner scan = new Scanner(System.in);
    int choice = scan.nextInt();
    switch(choice) {
    case 1:
    System.out.println("Option 1 selected");
    break;
    case 2:
    System.out.println("Option 2 selected");
    break;
    case 3:
    System.out.println("Option 3 selected");
    break;
    default:
    System.out.println("Invalid choice");
    }
    scan.close();
    }
}