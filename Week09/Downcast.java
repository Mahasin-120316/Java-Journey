package Week09;
class Parent{
    void display1(){
        System.out.println("Inside parent display1");
    }

    void display2(){
        System.out.println("Inside parent display2");
    }
}
class Child1 extends Parent{
    void display2(){
        System.out.println("Inside child1 display2");
    }
    void display3(){
        System.out.println("Inside child1 display3");
    }
}

class Child2 extends Parent{
    void display2(){
        System.out.println("Inside child2 display2");
    }
    void display4(){
        System.out.println("Inside child2 display4");
    }
}

public class Downcast {
    public static void main(String[] args) {
        Parent p = new Child1();
        p.display1();
        p.display2();
        Child1 c1 = (Child1) p;
        c1.display3();

        Parent p1 = new Child2();
        p1.display1();
        p1.display2();
        Child2 c2 = (Child2) p1;
        c2.display4();
    }
}
