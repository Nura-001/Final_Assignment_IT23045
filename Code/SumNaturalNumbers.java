import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class SumNaturalNumbers {
    public static void main(String[] args) throws FileNotFoundException {
        // File paths
        String inputFilePath = "input.txt";
        String outputFilePath = "output.txt";

        // Reading numbers from input file
        Scanner fileScanner = new Scanner(new File(inputFilePath));
        fileScanner.useDelimiter(",\\s*"); // Use comma as delimiter

        // Writing results to output file
        PrintWriter writer = new PrintWriter(outputFilePath);

        while (fileScanner.hasNext()) {
            if (fileScanner.hasNextInt()) { // Ensure it's an integer
                int number = fileScanner.nextInt();
                
                // Calculate sum of natural numbers up to the given number
                long sum = (long) number * (number + 1) / 2; // Using long to avoid overflow
                
                // Write result to output file
                writer.print(sum + ", ");
            } else {
                fileScanner.next(); // Skip invalid values
            }
        }

        fileScanner.close();
        writer.close();

        System.out.println("Processing complete. Check output.txt for the results.");
    }
}
