public class ArithmeticOperations {

    public static void exceptionHandlerCodesCpp(String[] args) {
        try {
            // Check if there are at least two arguments
            if (args.length < 2) {
                throw new IllegalArgumentException("Two integer arguments are required.");
            }

            // Parse the arguments as integers
            int num1 = Integer.parseInt(args[0]);
            int num2 = Integer.parseInt(args[1]);

            // Perform arithmetic operations
            int sum = num1 + num2;
            int difference = num1 - num2;
            int product = num1 * num2;

            // Check for division by zero
            if (num2 == 0) {
                throw new ArithmeticException("Cannot divide by zero.");
            }

            int quotient = num1 / num2;

            // Print results
            System.out.println("Sum: " + sum);
            System.out.println("Difference: " + difference);
            System.out.println("Product: " + product);
            System.out.println("Quotient: " + quotient);

        } catch (NumberFormatException e) {
            System.err.println("Invalid input: Both arguments must be integers.");
        } catch (ArithmeticException e) {
            System.err.println("Error: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        } catch (Exception e) { // Catch any other unexpected exceptions
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    // Main method to run the code and pass arguments to exceptionHandlerCodesCpp
    public static void main(String[] args) {
        // Call the method with command-line arguments
        exceptionHandlerCodesCpp(args);
    }
}
