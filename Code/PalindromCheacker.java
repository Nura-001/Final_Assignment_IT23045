import java.util.*;

public class PalindromeChecker {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Take input string
        String ch = sc.nextLine();
        
        // Initialize variables
        int i, j, flag = 0;
        
        // Loop to compare characters from start and end
        for (i = 0, j = ch.length() - 1; i < j; i++, j--) {
            if (ch.charAt(i) != ch.charAt(j)) {
                flag++;
                break;  // Exit the loop if characters do not match
            }
        }
        
        // Output the result
        if (flag == 0) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
        
        sc.close(); // Close the scanner
    }
}
