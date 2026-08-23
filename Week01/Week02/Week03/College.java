import java.util.Scanner;

class College {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of departments: ");
        int departments = sc.nextInt();
        System.out.println("Enter the number of classes: ");
        int classes = sc.nextInt();
        System.out.println("Enter the number of students: ");
        int students = sc.nextInt();

        int[][][] marks = new int[departments][classes][students];

        int total = 0;
        System.out.println("Enter the marks: ");
        // Reading marks
        for (int i = 0; i < departments; i++) {
            for (int j = 0; j < classes; j++) {
                for (int k = 0; k < students; k++) {

                    System.out.print("Enter marks: ");
                    marks[i][j][k] = sc.nextInt();

                    total = total + marks[i][j][k];
                }
            }
        }

        System.out.println("Total Marks = " + total);
        sc.close();
    }
}