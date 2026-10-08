package Week09;

class Developer {
    void work() {
        System.out.println("Developer is working");
    }

    void project() {
        System.out.println("Developer is working on a project");
    }
}

class JavaDeveloper extends Developer {
    @Override
    void work() {
        System.out.println("Java Developer is working");
    }

    @Override
    void project() {
        System.out.println("Java Developer is working on a project");
    }
}

class PythonDeveloper extends Developer {
    @Override
    void work() {
        System.out.println("Python Developer is working");
    }

    @Override
    void project() {
        System.out.println("Python Developer is working on a project");
    }
}

public class Demo4 {
    public static void main(String[] args) {
        JavaDeveloper jd = new JavaDeveloper();
        accessMethod(jd);
        PythonDeveloper pd = new PythonDeveloper();
        accessMethod(pd);
    }

    public static void accessMethod(Developer dev) {
        dev.work();
        dev.project();
    }
}