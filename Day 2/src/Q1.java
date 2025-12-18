class Q1 {
    public static void main(String[] args) {

        int evenCount = 0;
        int oddCount = 0;

        // Check if exactly 10 numbers are entered
        if (args.length != 10) {
            System.out.println("Please enter exactly 10 numbers.");
            return;
        }

        // Process command line arguments
        for (int i = 0; i < args.length; i++) {
            int num = Integer.parseInt(args[i]);

            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        // Output result
        System.out.println("Number of Even numbers: " + evenCount);
        System.out.println("Number of Odd numbers: " + oddCount);
    }
}
