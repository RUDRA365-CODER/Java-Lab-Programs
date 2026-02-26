import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[4];   // Array size is 4

        try {
            System.out.println("Enter 5 numbers:");

            for (int i = 0; i < 5; i++) {   // Intentionally going beyond size
                arr[i] = sc.nextInt();      // This will cause exception at index 4
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception in thread \"main\" " + e);
        }

        sc.close();
    }
}
