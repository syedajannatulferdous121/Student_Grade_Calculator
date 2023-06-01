import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of subjects: ");
        int numOfSubjects = scanner.nextInt();

        String[] subjectNames = new String[numOfSubjects];
        int[] subjectScores = new int[numOfSubjects];

        System.out.println("Enter the name of subjects and their scores:");
        for (int i = 0; i < numOfSubjects; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            subjectNames[i] = scanner.next();

            System.out.print("Score: ");
            subjectScores[i] = scanner.nextInt();
        }

        System.out.print("Enter the maximum grade: ");
        int maximumGrade = scanner.nextInt();

        System.out.print("Enter the passing grade: ");
        int passingGrade = scanner.nextInt();

        int totalScore = 0;
        for (int i = 0; i < numOfSubjects; i++) {
            totalScore += subjectScores[i];
        }

        double averageScore = (double) totalScore / numOfSubjects;

        System.out.println("Subject\t\tScore");
        for (int i = 0; i < numOfSubjects; i++) {
            System.out.println(subjectNames[i] + "\t\t" + subjectScores[i]);
        }

        System.out.println("Average Score: " + averageScore);
        System.out.println("Total Score: " + totalScore);

        scanner.close();
    }
}
