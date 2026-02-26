import java.io.*;
import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter file name: ");
            String filename = sc.nextLine();

            BufferedReader br = new BufferedReader(new FileReader(filename));

            int characters = 0;
            int words = 0;
            int lines = 0;

            String line;

            while ((line = br.readLine()) != null) {
                lines++;   // count line

                characters += line.length();   // count characters

                // count words
                String[] wordArray = line.trim().split("\\s+");
                if (!line.trim().isEmpty()) {
                    words += wordArray.length;
                }
            }

            br.close();

            System.out.println("No. of characters - " + characters);
            System.out.println("No. of lines - " + lines);
            System.out.println("No. of words - " + words);

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}