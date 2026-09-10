package Week06;

import java.util.Scanner;

public class SpaceCount {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String text = scanner.nextLine();
    int spaceCount = 0;
    for(int i = 0; i < text.length(); i++){
        if(text.charAt(i) == ' '){
            spaceCount++;
        }
    }
    System.out.println("Spaces: " + spaceCount);
    scanner.close();
    }
}
