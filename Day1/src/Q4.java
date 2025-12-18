// Aim: Program to check a user entered number is palindrome or not.

public class Q4 {
    public static void main(String[] args) {

        // Input: Mention the number here
        int num = 121;   // change this value to test other numbers

        int original = num;   // store original number
        int reversed = 0;

        // Reverse the number
        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num = num / 10;
        }

        // Output: Check palindrome
        if (original == reversed) {
            System.out.println(original + " is a Palindrome Number.");
        } else {
            System.out.println(original + " is NOT a Palindrome Number.");
        }
    }
}

