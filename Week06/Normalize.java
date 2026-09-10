package Week06;

import java.util.Scanner;

public class Normalize {
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    String learnerName = scanner.nextLine();
    String normalizeName = learnerName. trim().toUpperCase();
    System.out.println("Normalized name: " + normalizeName);
    scanner.close();
    }
}
