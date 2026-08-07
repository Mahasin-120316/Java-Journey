
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int processChoice;
        System.out.println("====================================");
        System.out.println("         CAMPUSTRACK                ");
        System.out.println("====================================");
        System.out.println(" Student Academic Management System ");
        System.out.println("------------------------------------");
        do {

            // Student Profile
            System.out.print("Enter student ID: ");
            String studentId = sc.next();

            sc.nextLine();

            System.out.print("Enter full name: ");
            String fullName = sc.nextLine();

            int age;
            System.out.print("Enter age: ");
            age = sc.nextInt();

            while (age < 15 || age > 35) {
                System.out.println("Invalid age Enter a value between 15 and 35");
                System.out.print("Enter age: ");
                age = sc.nextInt();
            }
            System.out.println("Age accepted");

            System.out.print("Enter email: ");
            String email = sc.next();

            String courseName = "";
            double baseFee = 0;
            int courseChoice;

            do {
                System.out.println("\nSelect course:");
                System.out.println("1. BCA");
                System.out.println("2. B.Sc Computer Science");
                System.out.println("3. B.E/B.Tech");
                System.out.println("4. MCA");
                System.out.println("5. Other");

                System.out.print("Enter course choice: ");
                courseChoice = sc.nextInt();

                switch (courseChoice) {
                    case 1:
                        courseName = "BCA";
                        baseFee = 35000;
                        break;
                    case 2:
                        courseName = "B.Sc Computer Science";
                        baseFee = 30000;
                        break;
                    case 3:
                        courseName = "B.E/B.Tech";
                        baseFee = 50000;
                        break;
                    case 4:
                        courseName = "MCA";
                        baseFee = 45000;
                        break;
                    case 5:
                        courseName = "Other";
                        baseFee = 25000;
                        break;
                    default:
                        System.out.println("Invalid course choice Select a value from 1 to 5");
                }

            } while (courseChoice < 1 || courseChoice > 5);

            System.out.println("Course selected: " + courseName);

            int semester;
            System.out.print("Enter semester (1-8): ");
            semester = sc.nextInt();

            while (semester < 1 || semester > 8) {
                System.out.println("Invalid semester Enter a value between 1 and 8");
                System.out.print("Enter semester (1-8): ");
                semester = sc.nextInt();
            }

            sc.nextLine();

            System.out.print("Enter career goal: ");
            String careerGoal = sc.nextLine();
            // Subject Marks
            int javaMarks;
            System.out.print("Enter Java marks: ");
            javaMarks = sc.nextInt();
            while (javaMarks < 0 || javaMarks > 100) {
                System.out.println("Invalid marks. Enter a value between 0 and 100.");
                System.out.print("Enter Java marks: ");
                javaMarks = sc.nextInt();
            }

            int sqlMarks;
            System.out.print("Enter SQL marks: ");
            sqlMarks = sc.nextInt();
            while (sqlMarks < 0 || sqlMarks > 100) {
                System.out.println("Invalid marks. Enter a value between 0 and 100.");
                System.out.print("Enter SQL marks: ");
                sqlMarks = sc.nextInt();
            }

            int webTechnologyMarks;
            System.out.print("Enter Web Technology marks: ");
            webTechnologyMarks = sc.nextInt();
            while (webTechnologyMarks < 0 || webTechnologyMarks > 100) {
                System.out.println("Invalid marks. Enter a value between 0 and 100.");
                System.out.print("Enter Web Technology marks: ");
                webTechnologyMarks = sc.nextInt();
            }

            int aptitudeMarks;
            System.out.print("Enter Aptitude marks: ");
            aptitudeMarks = sc.nextInt();
            while (aptitudeMarks < 0 || aptitudeMarks > 100) {
                System.out.println("Invalid marks. Enter a value between 0 and 100.");
                System.out.print("Enter Aptitude marks: ");
                aptitudeMarks = sc.nextInt();
            }

            int communicationMarks;
            System.out.print("Enter Communication marks: ");
            communicationMarks = sc.nextInt();
            while (communicationMarks < 0 || communicationMarks > 100) {
                System.out.println("Invalid marks. Enter a value between 0 and 100.");
                System.out.print("Enter Communication marks: ");
                communicationMarks = sc.nextInt();
            }

            int totalMarks = javaMarks + sqlMarks + webTechnologyMarks + aptitudeMarks + communicationMarks;
            double percentage = (double) totalMarks / 5;

            boolean subjectPass
                    = javaMarks >= 35
                    && sqlMarks >= 35
                    && webTechnologyMarks >= 35
                    && aptitudeMarks >= 35
                    && communicationMarks >= 35;

            boolean academicPass = subjectPass && percentage >= 40;
            String academicResult = academicPass ? "PASSED" : "FAILED";

            String grade;
            if (!academicPass) {
                grade = "F";
            } else if (percentage >= 85) {
                grade = "A+";
            } else if (percentage >= 75) {
                grade = "A";
            } else if (percentage >= 65) {
                grade = "B";
            } else if (percentage >= 50) {
                grade = "C";
            } else {
                grade = "D";
            }
            // Attendance
            int totalClasses;
            System.out.print("Enter total classes conducted: ");
            totalClasses = sc.nextInt();

            while (totalClasses < 1 || totalClasses > 300) {
                System.out.println("Invalid value. Total classes must be between 1 and 300.");
                System.out.print("Enter total classes conducted: ");
                totalClasses = sc.nextInt();
            }

            int attendedClasses;
            System.out.print("Enter classes attended: ");
            attendedClasses = sc.nextInt();

            while (attendedClasses < 0 || attendedClasses > totalClasses) {
                System.out.println("Invalid attendance. Attended classes cannot exceed " + totalClasses + ".");
                System.out.print("Enter classes attended: ");
                attendedClasses = sc.nextInt();
            }

            double attendancePercentage
                    = ((double) attendedClasses / totalClasses) * 100;

            String attendanceStatus
                    = attendancePercentage >= 75 ? "REGULAR" : "SHORTAGE";
            // Assignments
            int assignmentEntries;
            System.out.print("How many assignment scores do you want to enter? ");
            assignmentEntries = sc.nextInt();

            while (assignmentEntries < 1 || assignmentEntries > 10) {
                System.out.println("Invalid count Enter a value between 1 and 10");
                System.out.print("How many assignment scores do you want to enter? ");
                assignmentEntries = sc.nextInt();
            }

            int assignmentTotal = 0;
            int validAssignments = 0;

            for (int i = 1; i <= assignmentEntries; i++) {

                System.out.print("Enter score for assignment " + i + " (0-10, -1 to finish): ");
                int score = sc.nextInt();

                if (score == -1) {
                    System.out.println("Assignment entry completed early");
                    break;
                }

                if (score < -1 || score > 10) {
                    System.out.println("Invalid score Assignment " + i + " skipped");
                    continue;
                }

                assignmentTotal += score;
                validAssignments++;

                System.out.println("Assignment score accepted");
            }

            double assignmentAverage;

            if (validAssignments > 0) {
                assignmentAverage = (double) assignmentTotal / validAssignments;
            } else {
                assignmentAverage = 0.0;
            }

            boolean assignmentPass
                    = validAssignments > 0 && assignmentAverage >= 5;

            String assignmentStatus
                    = assignmentPass ? "SATISFACTORY" : "NEEDS IMPROVEMENT";
            // Scholarship
            int scholarshipPercent;

            if (academicPass && percentage >= 85 && attendancePercentage >= 85) {
                scholarshipPercent = 10;
            } else if (academicPass && percentage >= 75 && attendancePercentage >= 75) {
                scholarshipPercent = 5;
            } else {
                scholarshipPercent = 0;
            }

            double scholarshipAmount
                    = baseFee * scholarshipPercent / 100.0;

            double finalPayableFee
                    = baseFee - scholarshipAmount;

            // Fee Payment
            double amountPaid;
            System.out.printf("Final payable fee: ₹%.2f%n", finalPayableFee);

            System.out.print("Enter amount paid: ");
            amountPaid = sc.nextDouble();

            while (amountPaid < 0 || amountPaid > finalPayableFee) {
                System.out.println("Invalid amount Enter a value between 0 and final payable fee");
                System.out.print("Enter amount paid: ");
                amountPaid = sc.nextDouble();
            }

            double feeBalance = finalPayableFee - amountPaid;

            String feeStatus = feeBalance == 0 ? "PAID" : "PENDING";

            // Final Clearance
            boolean finalClearance = academicPass && attendancePercentage >= 75 && assignmentPass && feeBalance == 0;

            String semesterStatus = finalClearance ? "CLEARED FOR NEXT SEMESTER" : "ACTION REQUIRED";
            // Report
            System.out.println("\n========================================================");
            System.out.println("                 STUDENT SEMESTER REPORT");
            System.out.println("========================================================");

            System.out.printf("Student ID                 : %s%n", studentId);
            System.out.printf("Student Name               : %s%n", fullName);
            System.out.printf("Age                        : %d%n", age);
            System.out.printf("Email                      : %s%n", email);
            System.out.printf("Course                     : %s%n", courseName);
            System.out.printf("Semester                   : %d%n", semester);
            System.out.printf("Career Goal                : %s%n", careerGoal);

            System.out.println("\n---------------- ACADEMIC SUMMARY --------------------");

            System.out.printf("Java Marks                 : %d%n", javaMarks);
            System.out.printf("SQL Marks                  : %d%n", sqlMarks);
            System.out.printf("Web Technology Marks       : %d%n", webTechnologyMarks);
            System.out.printf("Aptitude Marks             : %d%n", aptitudeMarks);
            System.out.printf("Communication Marks        : %d%n", communicationMarks);
            System.out.printf("Total Marks                : %d/500%n", totalMarks);
            System.out.printf("Percentage                 : %.2f%%%n", percentage);
            System.out.printf("Academic Result            : %s%n", academicResult);
            System.out.printf("Grade                      : %s%n", grade);

            System.out.println("\n---------------- ATTENDANCE SUMMARY ------------------");

            System.out.printf("Classes Conducted          : %d%n", totalClasses);
            System.out.printf("Classes Attended           : %d%n", attendedClasses);
            System.out.printf("Attendance Percentage      : %.2f%%%n", attendancePercentage);
            System.out.printf("Attendance Status          : %s%n", attendanceStatus);

            System.out.println("\n---------------- ASSIGNMENT SUMMARY ------------------");

            System.out.printf("Valid Assignments          : %d%n", validAssignments);
            System.out.printf("Assignment Total           : %d%n", assignmentTotal);
            System.out.printf("Assignment Average         : %.2f%n", assignmentAverage);
            System.out.printf("Assignment Status          : %s%n", assignmentStatus);

            System.out.println("\n---------------- FEE SUMMARY -------------------------");

            System.out.printf("Base Semester Fee          : ₹%.2f%n", baseFee);
            System.out.printf("Scholarship Percentage     : %d%%%n", scholarshipPercent);
            System.out.printf("Scholarship Amount         : ₹%.2f%n", scholarshipAmount);
            System.out.printf("Final Payable Fee          : ₹%.2f%n", finalPayableFee);
            System.out.printf("Amount Paid                : ₹%.2f%n", amountPaid);
            System.out.printf("Fee Balance                : ₹%.2f%n", feeBalance);
            System.out.printf("Fee Status                 : %s%n", feeStatus);

            System.out.println("\n---------------- FINAL STATUS ------------------------");

            System.out.printf("Semester Clearance         : %s%n", semesterStatus);

            System.out.println("\n---------------- FAILED CONDITIONS -------------------");

            if (finalClearance) {
                System.out.println("None");
            } else {

                if (javaMarks < 35) {
                    System.out.println("- Java marks are below 35.");
                }

                if (sqlMarks < 35) {
                    System.out.println("- SQL marks are below 35.");
                }

                if (webTechnologyMarks < 35) {
                    System.out.println("- Web Technology marks are below 35.");
                }

                if (aptitudeMarks < 35) {
                    System.out.println("- Aptitude marks are below 35.");
                }

                if (communicationMarks < 35) {
                    System.out.println("- Communication marks are below 35.");
                }

                if (percentage < 40) {
                    System.out.println("- Overall percentage is below 40%.");
                }

                if (attendancePercentage < 75) {
                    System.out.println("- Attendance is below 75%.");
                }

                if (validAssignments == 0) {
                    System.out.println("- No valid assignment score was entered.");
                } else if (assignmentAverage < 5) {
                    System.out.println("- Assignment average is below 5.00.");
                }

                if (feeBalance > 0) {
                    System.out.println("- Semester fee is pending.");
                }
            }

            System.out.println("\n---------------- RECOMMENDATIONS ---------------------");

            if (finalClearance) {
                System.out.println("Maintain the current performance in the next semester.");
            } else {

                if (javaMarks < 35 || sqlMarks < 35 || webTechnologyMarks < 35
                        || aptitudeMarks < 35 || communicationMarks < 35) {
                    System.out.println("- Revisit the failed subject and complete additional practice.");
                }

                if (percentage < 40) {
                    System.out.println("- Improve overall academic performance.");
                }

                if (attendancePercentage < 75) {
                    System.out.println("- Attend classes regularly and clear the attendance shortage.");
                }

                if (!assignmentPass) {
                    System.out.println("- Complete assignments consistently and maintain an average of at least 5.00.");
                }

                if (feeBalance > 0) {
                    System.out.println("- Pay the pending semester fee before clearance.");
                }
            }

            System.out.println("========================================================");

            // Process Another Student
            do {
                System.out.println("\nDo you want to process another student?");
                System.out.println("1. Yes");
                System.out.println("0. No");
                System.out.print("Enter choice: ");

                processChoice = sc.nextInt();

                if (processChoice != 0 && processChoice != 1) {
                    System.out.println("Invalid choice. Enter 1 or 0.");
                }

            } while (processChoice != 0 && processChoice != 1);

        } while (processChoice == 1);

        System.out.println("Thank you for using CampusTrack.");

        sc.close();
    }
}
