package Week08;
import java.util. Scanner;

class Product {
private double price;

Product(double price) {
// Store the value
this.price = price;
}
// Create getPrice()
public double getPrice(){
return price;

}
}

public class Pro{
public static void main(String[] args) {
Scanner scanner = new Scanner(System. in);
double price = scanner.nextDouble();
// Read price
Product p = new Product(price);
// Create Product
System.out.println(p.getPrice());
scanner.close();
}
}
