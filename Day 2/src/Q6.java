class Subtract {

    // subtract two integers
    void subtract(int a, int b) {
        System.out.println("Subtraction of two integers = " + (a - b));
    }

    // subtract three integers
    void subtract(int a, int b, int c) {
        System.out.println("Subtraction of three integers = " + (a - b - c));
    }

    // subtract two double values
    void subtract(double a, double b) {
        System.out.println("Subtraction of two double values = " + (a - b));
    }
}

class SubtractDemo {
    public static void main(String[] args) {

        Subtract s = new Subtract();

        s.subtract(10, 5);
        s.subtract(20, 5, 3);
        s.subtract(15.5, 5.2);
    }
}

