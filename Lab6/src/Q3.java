import java.util.Scanner;

// User-defined Exception
class NegativeNumberException extends Exception {
    public NegativeNumberException(String message) {
        super(message);
    }
}

public class Q3 {

    public void ProcessInput(int num) throws NegativeNumberException {
        if (num < 0) {
            throw new NegativeNumberException("number should be positive");
        } else {
            System.out.println("Double value: " + (num * 2));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Q3 obj = new Q3();

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        try {
            obj.ProcessInput(number);
        }
        catch (NegativeNumberException e) {
            System.out.println("Caught the exception");
            System.out.println("Exception occurred: " + e);
        }

        sc.close();
    }
}
