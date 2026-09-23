package Week07;
import java.util.Scanner;
class Message {
String text;
Message(String text) {
    this.text = text;
}
void displayText() {
    System.out.println("Message: " + text + " ");
}
static void displayCourse() {
    System.out.println("Course: Java");
}
}
public class Call1 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String inputText = scanner.nextLine();
        Message msg = new Message(inputText);
        msg.displayText();
        Message.displayCourse();
        scanner.close();
    }
}
