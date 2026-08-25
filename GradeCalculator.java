import java.util.Scanner;

class GradeSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // taking input of total number of subjects
        System.out.print("Enter total number of subjects: ");
        int sub = sc.nextInt();

        // storing marks in array
        float[] marks = new float[sub];
        float sum = 0;

        // input marks with validation
        for (int i = 0; i < sub; i++) {
            float mark;
            do {
                System.out.print("Enter marks for subject " + (i + 1) + " (0 to 100): ");
                mark = sc.nextFloat();
                if (mark < 0 || mark > 100) {
                    System.out.println("Invalid input! Marks should be between 0 and 100.");
                }
            } while (mark < 0 || mark > 100);

            marks[i] = mark;
            sum += mark;
        }

        // calculate percentage
        float averagePer = sum / sub;

        // grade calculation
        String grade;
        if (averagePer > 95 && averagePer <= 100) {
            grade = "A+";
        } else if (averagePer > 90 && averagePer <= 95) {
            grade = "A";
        } else if (averagePer > 75 && averagePer <= 90) {
            grade = "B+";
        } else if (averagePer > 65 && averagePer <= 75) {
            grade = "B";
        } else if (averagePer > 55 && averagePer <= 65) {
            grade = "C+";
        } else if (averagePer > 45 && averagePer <= 55) {
            grade = "C";
        } else {
            grade = "D";
        }

        // display output
        System.out.println("--- Result ---");
        System.out.println("Total Marks: " + sum + " out of " + (sub * 100));
        System.out.println("Percentage: "+ averagePer);
        System.out.println("Grade: " + grade);
    }
}
