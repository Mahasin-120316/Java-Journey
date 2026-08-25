
public class CourseAdvisor {

    public static void main(String[] args) {
        // candidate details
        String studentName = "Mehu";
        int interestCategory = 1;
        int programmingConfidence = 75;
        int logicalAbility = 80;
        int dailyStudyTime = 5;
        String careerGoal = "Backend Developer";
        // result
        String selectedInterest;
        String readinessStatus = "";
        String learningPath = "";
        String foundationRevision;
        String finalRecommendation;
        // interest categories
        switch (interestCategory) {
            case 1:
                selectedInterest = "Software Development";
                break;
            case 2:
                selectedInterest = "Data and Analytics";
                break;
            case 3:
                selectedInterest = "Testing";
                break;
            case 4:
                selectedInterest = "Web Development";
                break;

            default:
                selectedInterest = "Invalid Interest Category";
                if (programmingConfidence >= 70 && logicalAbility >= 70 && dailyStudyTime >= 3) {
                    readinessStatus = "Ready to Begin";
                } else {
                    readinessStatus = "Need Improvement";
                }
                // Learning path using nested 
                if (interestCategory == 1) {
                    if (programmingConfidence >= 70 && logicalAbility >= 70) {
                        learningPath = "Software Development";
                    } else {
                        learningPath = "Programming Basics, Logic Building and Java Foundations";
                    }
                } else if (interestCategory == 2) {
                    if (programmingConfidence >= 70 && logicalAbility >= 70) {
                        learningPath = "Data and Analytics";
                    } else {
                        learningPath = "Basic Mathematics, Excel and SQL Foundations";
                    }
                } else if (interestCategory == 3) {
                    if (programmingConfidence >= 65 && logicalAbility >= 65) {
                        learningPath = "Testing";
                    } else {
                        learningPath = "Computer Basics and Manual Testing Foundations";
                    }
                } else if (interestCategory == 4) {
                    if (programmingConfidence >= 70 && logicalAbility >= 65) {
                        learningPath = "Web Development";
                    } else {
                        learningPath = "HTML, CSS and Web Fundamentals";
                    }
                    System.out.println("Recommended Learning Path: " + learningPath);
                }
        }
        // Ternary 
        foundationRevision = (programmingConfidence < 60 || logicalAbility < 60) ? "Yes" : "No";
        // Final recommendation
        if (foundationRevision.equals("Yes")) {
            finalRecommendation = "Revise fundamentals before starting the main learning path";
        } else {
            finalRecommendation = "Begin the learning path and practise consistently";
        }
        // Print report
        System.out.println("COURSE SELECTION REPORT\\n");

        System.out.println("Student Name: " + studentName);
        System.out.println("Selected Interest: " + selectedInterest);
        System.out.println("Career Goal: " + careerGoal);

        System.out.println("\\nReadiness Status: " + readinessStatus);
        System.out.println("Recommended Learning Path: " + learningPath);
        System.out.println("Suggested Daily Study Time: " + dailyStudyTime + " Hours");
        System.out.println("Foundation Revision Required: " + foundationRevision);

        System.out.println("\\nFinal Recommendation:");
        System.out.println(finalRecommendation);

        // do-while loop
        int day = 1;
        do {
            System.out.println("Practice Reminder Day " + day);
            day++;
        } while (day <= 2);
    }
}

