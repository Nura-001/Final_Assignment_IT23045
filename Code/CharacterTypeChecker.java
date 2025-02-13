public class CharacterTypeChecker {

    // Method to check and classify characters as letter, whitespace, or digit
    public static void checkCharacterType(char[] inputArray) {
        for (char c : inputArray) {
            if (Character.isLetter(c)) {
                System.out.println(c + " is a letter.");
            } else if (Character.isDigit(c)) {
                System.out.println(c + " is a digit.");
            } else if (Character.isWhitespace(c)) {
                System.out.println("'" + c + "' is a whitespace.");
            } else {
                System.out.println(c + " is neither a letter, digit, nor whitespace.");
            }
        }
    }

    public static void main(String[] args) {
        String inputString = "Hello 123 World!";
        
        // Convert string to character array
        char[] inputArray = inputString.toCharArray();
        
        // Pass the array to the method to check character types
        checkCharacterType(inputArray);
    }
}
