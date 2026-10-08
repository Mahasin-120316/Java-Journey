package Week09;
class Animal {
    void eat() {
        System.out.println("Animal eats");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

public class Upcast {
    public static void main(String[] args) {

        Animal a = new Dog();   
        a.eat();                
    }
}

