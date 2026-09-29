package Week08;
import java.util. Scanner;
class BankAccount{
    private double balance;
    BankAccount(double balance) {
        if(balance > 0){
            this.balance = balance;
        } else{
            this.balance = 0;
        }
    }
    public void deposit(double amount) {
        if(amount > 0){
            this.balance += amount;
        }
    }
    public double getBalance() {
        return this.balance;
    }
}
public class Bank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System. in);
        double balance = scanner.nextDouble();
        double amount = scanner.nextDouble();
        BankAccount b=new BankAccount(balance);
        b.deposit(amount);
        System.out.println(b.getBalance());
        scanner.close();
    }
}
