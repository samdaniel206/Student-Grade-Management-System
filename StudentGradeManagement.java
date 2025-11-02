import java.util.Scanner;

public class StudentGradeManagement {

    public static String calculateGrade(double avg) {
        if (avg >= 70) {
            return "A";
        } else if (avg >= 50) {
            return "B";
        } else if (avg >= 35) {
            return "C";
        } else {
            return "Fail";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = sc.nextLine().trim();

        int subjects = 3;
        int total = 0;

        for (int i = 1; i <= subjects; i++) {
            System.out.print("Enter marks for subject " + i + " (0-100): ");
            int marks = sc.nextInt();

            if (marks < 0 || marks > 100) {
                System.out.println("Invalid marks! Please enter a value between 0 and 100.");
                i--;
                continue;
            }

            total += marks;
        }

        double average = (double) total / subjects;
        String grade = calculateGrade(average);

        System.out.println("\n--- Student Report ---");
        System.out.println("Name: " + name);
        System.out.println("Total Marks: " + total + " / " + (subjects * 100));
        System.out.printf("Average: %.2f%%\n", average);
        System.out.println("Grade: " + grade);

        sc.close();
    }
}