import java.util.Scanner;

class College {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int departments = 2;
        int classes = 2;
        int students = 3;

        int[][][] marks = new int[departments][classes][students];

        int total = 0;

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