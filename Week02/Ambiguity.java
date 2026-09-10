class Method {
    void display(short a, short b) {
        System.out.println("short");
    }

    void display(int a, int b) {
        System.out.println("int");
    }
}

public class Ambiguity {
    public static void main(String[] args) {
        Method m = new Method();
        m.display(10, 10);
    }
}