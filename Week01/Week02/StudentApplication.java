class StudentApplication {

    static class Student {

        int roll;
        String name;
        double height;

        void run() {
            System.out.println("running");
        }

        void sleep() {
            System.out.println("sleeping");
        }
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.roll = 10;
        s1.name = "Mehu";
        s1.height = 5.2;
        System.out.println(s1.roll);
        System.out.println(s1.name);
        System.out.println(s1.height);
        s1.run();
        s1.sleep();
    }
}
