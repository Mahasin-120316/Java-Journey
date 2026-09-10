package Week06;
import java.util.Scanner;

public class CharCount{
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String text = scanner.nextLine();
    char target = scanner.nextLine().charAt(0);
    int count = 0;
    for(int i = 0;i < text. length(); i++){
        if(text.charAt(i) == target){
            count++;
        }
    }
        System.out.println("Occurrences: " + count);
        scanner.close();
}
}