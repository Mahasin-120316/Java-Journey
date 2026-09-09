package Week06;

import java.util.Scanner;

public class CourseDetails {
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        String courseName = sc.nextLine();
        String trainerName = sc.nextLine();
        System.out.println("Course: " + courseName);
        System.out.println("Trainer: " + trainerName);
        sc.close();
    }
}
