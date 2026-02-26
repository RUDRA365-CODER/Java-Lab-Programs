public class Q2 {

    public static void main(String[] args) {

        int a = 10;
        int b = 0;   // Division by zero

        try {
            int result = a / b;   // This will cause ArithmeticException
            System.out.println("Result: " + result);
        }

        catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught by try-catch-finally block");
        }

        finally {
            System.out.println("Finally block executed");
        }
    }
}
