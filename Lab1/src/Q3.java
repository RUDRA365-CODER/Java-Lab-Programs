// Aim: Write a program to print the week day for the given day number using switch case.

public class Q3 {
    public static void main(String[] args) {

        // Input: Mention the day number here (1 to 7)
        int day = 5;  // change this value to test other days

        // Output: Display week day
        switch (day) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid Day Number");
        }
    }
}

