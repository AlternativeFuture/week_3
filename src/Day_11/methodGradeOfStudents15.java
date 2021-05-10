package Day_11;

import java.util.Scanner;

public class methodGradeOfStudents15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of students_");
        int numStudents = scanner.nextInt();
        int[] gradeOfStudents = new int[numStudents];
        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter the grade for student " + (i + 1) + "_");
            int grade = scanner.nextInt();
            gradeOfStudents[i] = grade;
        }
        int minimum = 100, maximum = 0;
        double average = 0.00;
        for (int i = 0; i < gradeOfStudents.length; i++) {
            average += gradeOfStudents[i];
            if (i == 0) {
                minimum = maximum = gradeOfStudents[i];
            } else {
                if (gradeOfStudents[i] > maximum) {
                    maximum = gradeOfStudents[i];
                } else if (gradeOfStudents[i] < minimum) {
                    minimum = gradeOfStudents[i];
                }
            }
        }

        average /= gradeOfStudents.length;
        System.out.println("The average is: " + average);
        System.out.println("The minimum is: " + minimum);
        System.out.println("The maximum is: " + maximum);

    }

//    public static double roundAvoid(double value, int places) {
//        double scale = Math.pow(10, places);
//        return Math.round(value * scale) / scale;
//    }
}



