// Aim: Write a program to print the corresponding grade for the given mark using if..else statement.

public class Q2 {
    public static void main(String[] args) {

        // Input: Mention the mark here
        int mark = 85;   // change this value to test other grades

        // Output: Display Grade
        if (mark >= 90 && mark <= 100) {
            System.out.println("Grade: O");
        }
        else if (mark >= 80 && mark < 90) {
            System.out.println("Grade: E");
        }
        else if (mark >= 70 && mark < 80) {
            System.out.println("Grade: A");
        }
        else if (mark >= 60 && mark < 70) {
            System.out.println("Grade: B");
        }
        else if (mark >= 50 && mark < 60) {
            System.out.println("Grade: C");
        }
        else {
            System.out.println("Grade: Fail");
        }
    }
}

