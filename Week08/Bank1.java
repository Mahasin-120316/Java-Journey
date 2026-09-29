package Week08;

import java.util.Scanner;

public class Bank1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double balance = scanner.nextDouble();
        double amount = scanner.nextDouble();
        BankAccount b = new BankAccount(balance);
        b.withdraw(amount);
        System.out.println(b.getBalance());
        scanner.close();
    }
}
