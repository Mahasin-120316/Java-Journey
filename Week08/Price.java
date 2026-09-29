package Week08;

import java.util.Scanner;

class Product {
    private double price;

    public Product() {
    }

    public Product(double price) {
        this.price = price;
    }

    public boolean setPrice(double price) {
        if (price >= 0) {
            this.price = price;
            return true;
        }
        return false;
    }

    public double getPrice() {
        return this.price;
    }
}

public class Price {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double inputPrice = scanner.nextDouble();
        Product p = new Product();
        if (p.setPrice(inputPrice)) {
            System.out.println(p.getPrice());
        } else {
            System.out.println("Invalid price");
        }
        scanner.close();
    }
}

