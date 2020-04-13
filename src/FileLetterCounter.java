import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class FileLetterCounter {

    public static void main(String[] args) throws IOException {

        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Prompt user for file name
        System.out.print("Enter file name:");
        String fileName = input.nextLine();

        //Path currentPath = Paths.get(System.getProperty("user.dir"));
        //Path filePath = Paths.get(currentPath.toString(), fileName);

        // Create File
        File file = new File(fileName);

        // Ensure that file exist
        if (!file.exists()) {
            System.out.print("The file " + fileName + " does not exist.");
            System.exit(0);
        }

        // Create scanner object to open file.
        Scanner fileInput = new Scanner(file);
        // Prompt user for the specified character and store in variable
        System.out.print(" Enter character to count:");
        String charInput = input.nextLine();
        char character = charInput.charAt(0);


        // Declare var to store lines from the file
        String line;

        // Declare counting variable
        int count = 0;

        // Construct while and for loop to calculate the number of
        // times the specified character appears within the file.

        while (fileInput.hasNext()) {
            line = fileInput.nextLine();
            for (int j = 0; j < line.length(); j++) {
                if (line.charAt(j) == character) {
                    count += 1;
                }
            }
        }

        // Diplay character count
        System.out.print(" The character '" + character + "' appears in the file " + fileName + " " + count + " times.");

        // Close file
        fileInput.close();
    }
}