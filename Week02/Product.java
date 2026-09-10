import java.util.Scanner;

public class Product {
    String name;
    double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    void displayProduct() {
        System.out.println("Product Name: " + name);
        System.out.println("Product Price: " + price);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        double price = sc.nextDouble();

        Product p1 = new Product(name, price);
        p1.displayProduct();
        sc.close();
    }
}
