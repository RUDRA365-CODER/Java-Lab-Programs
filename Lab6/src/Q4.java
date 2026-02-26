import java.util.Scanner;

// User-defined Exceptions
class HrsException extends Exception {
    public HrsException(String message) {
        super(message);
    }
}

class MinException extends Exception {
    public MinException(String message) {
        super(message);
    }
}

class SecException extends Exception {
    public SecException(String message) {
        super(message);
    }
}

class Time {
    int hours, minutes, seconds;

    public void getTime(int h, int m, int s)
            throws HrsException, MinException, SecException {

        if (h < 0 || h > 24)
            throw new HrsException("hour is not greater than 24");

        if (m < 0 || m > 60)
            throw new MinException("minute is not greater than 60");

        if (s < 0 || s > 60)
            throw new SecException("second is not greater than 60");

        hours = h;
        minutes = m;
        seconds = s;

        System.out.println("Correct Time-> " + hours + ":" + minutes + ":" + seconds);
    }
}

public class Q4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Time t = new Time();

        System.out.print("Enter hours: ");
        int h = sc.nextInt();

        System.out.print("Enter minutes: ");
        int m = sc.nextInt();

        System.out.print("Enter seconds: ");
        int s = sc.nextInt();

        try {
            t.getTime(h, m, s);
        }
        catch (HrsException e) {
            System.out.println("Caught the exception");
            System.out.println("Exception occurred: " + e);
        }
        catch (MinException e) {
            System.out.println("Caught the exception");
            System.out.println("Exception occurred: " + e);
        }
        catch (SecException e) {
            System.out.println("Caught the exception");
            System.out.println("Exception occurred: " + e);
        }

        sc.close();
    }
}
