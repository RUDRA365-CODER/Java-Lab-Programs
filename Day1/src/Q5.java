// Aim: Write a program to take first name and last name from user
// and print both in one line as: LastName FirstName

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input from user
        System.out.print("Enter First Name: ");
        String firstName = sc.nextLine();

        System.out.print("Enter Second Name: ");
        String lastName = sc.nextLine();

        // Output in required format
        System.out.println(lastName + " " + firstName);

        sc.close();
    }
}
