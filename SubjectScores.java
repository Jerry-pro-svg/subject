import java.util.Scanner;

public class SubjectScores {
    public static void main(String[] args) {
        
        try (Scanner scanner = new Scanner(System.in)) {
            
            System.out.print("Enter the number of subjects: ");
            int numberOfSubjects = scanner.nextInt();
            
            if (numberOfSubjects <= 0) {
                System.out.println("Invalid number of subjects.");
                return; 
            }   int totalScore = 0;
            
            for (int i = 0; i < numberOfSubjects; i++) {
                System.out.print("Enter score for subject " + (i + 1) + ": ");
                int score = scanner.nextInt();
                
                
                if (score >= 95 && score <= 100) {
                    System.out.println("You are super intelligent.");
                } else if (score == 90) {
                    System.out.println("You have an excellent result.");
                } else if (score < 90) {
                    System.out.println("You passed.");
                } else {
                    System.out.println("Invalid score. Scores must be between 0 and 100.");
                }
                
                
                totalScore += score;
            }   
            double percentage = (double) totalScore / numberOfSubjects;
            System.out.println("Your total percentage is: " + percentage + "%");
            
        }
    }
}
