import java.util.Scanner;

public class Student3 {
    String name;
    String courseName;
    int completedTopics;
    int questionsSolved;

    void setDetails(String name, String courseName){
        this.name = name;
        this.courseName = courseName;
    }

    void setProgress(int completedTopics, int questionsSolved) {
        this.completedTopics = completedTopics;
        this.questionsSolved = questionsSolved;
    }


    void displayDetails(){
        System.out.println("Student Name: " + this.name );
        System.out.println("Course Name: " + this.courseName);
    }

    void displayProgress(){
        System.out.println("Completed Topics: " + this.completedTopics);
        System.out.println("Questions Solved: " + this.questionsSolved);
    }

    void addTopics(int newTopics){
        this.completedTopics = this.completedTopics + newTopics;
    }


    void addQuestions(int newQuestions){
        this.questionsSolved = this.questionsSolved + newQuestions;
    }
}



class StudentApp {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        Student student = new Student();
        System.out.println("Enter the Student Name: ");
        String name = sc.nextLine();

        System.out.println("Enter the Course Name: ");
        String courseName = sc.nextLine();

        System.out.println("Enter Completed Topics: ");
        int completedTopics = sc.nextInt();
        System.out.println("Enter Questions Solved: ");
        int questionsSolved = sc.nextInt();

        student.setDetails(name, courseName);
        student.setProgress(completedTopics,questionsSolved);


        while(true){
            System.out.println("================================");
            System.out.println("STUDENT PRACTICE TRACKER");
            System.out.println("================================");
            System.out.println("1.View Student Details");
            System.out.println("2.View Progress");
            System.out.println("3.Add Completed Topics");
            System.out.println("4.Add Solved Questions");
            System.out.println("5.Exit");
            System.out.println();
            System.out.println("Enter your choice: ");
            int choice = sc.nextInt();
            
            if(choice == 1) {
                student.displayDetails();
            }
            else if(choice == 2) {
                student.displayProgress();
            }

            else if(choice == 3){
                    System.out.println("How many new topics did you complete?");
                    System.out.println("Enter New Completed Topics:");
                    int newTopics = sc.nextInt();
                    student.addTopics(newTopics);
                    System.out.println("Topics updated successfully.");
                    System.out.println("Total Completed Topics: " + student.completedTopics);
            }
            else if(choice == 4){
                    System.out.println("How many new questions did you solve?");
                    System.out.println("Enter New Questions Solved:");
                    int newQuestions = sc.nextInt();
                    student.addQuestions(newQuestions);
                    System.out.println("Questions updated successfully.");
                    System.out.println("Total Questions Solved: " + student.questionsSolved);
            }

            else if (choice == 5) {
                System.out.println("Thank you for using the Student Practice Tracker.");
                System.out.println("Keep practicing!");
                break;
            }
            else {
                System.out.println("Invalid Choice.");
                System.out.println("Please enter a valid choice between 1 and 5.");
            }
        }
        sc.close();
    }
}
