import java.io.*;

public class Q3 {
    public static void main(String[] args) {

        // Specify two binary files here
        String file1 = "D:\\Java Lab\\Java-Lab-Programs\\Lab7\\file1.bin";
        String file2 = "D:\\Java Lab\\Java-Lab-Programs\\Lab7\\file2.bin";

        try {
            FileInputStream fis1 = new FileInputStream(file1);
            FileInputStream fis2 = new FileInputStream(file2);

            int byte1, byte2;
            int position = 0;
            boolean equal = true;

            while (true) {
                byte1 = fis1.read();
                byte2 = fis2.read();
                position++;

                // If bytes are different
                if (byte1 != byte2) {
                    equal = false;
                    System.out.println("Two files are not equal: byte position at which two files differ is " + position);
                    break;
                }

                // If end of both files reached
                if (byte1 == -1 && byte2 == -1) {
                    break;
                }
            }

            if (equal) {
                System.out.println("Two files are equal");
            }

            fis1.close();
            fis2.close();

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}