import java.util.Scanner;

public class FactorionFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Taking lower and upper bound input
        System.out.println("Enter lower bound :");
        int n1 = sc.nextInt();
        System.out.println("Enter upper bound :");
        int n2 = sc.nextInt();
        
        // Precompute factorials of digits 0-9 to avoid recalculating repeatedly
        int[] factorials = new int[10];
        for (int i = 0; i < 10; i++) {
            factorials[i] = 1;
            for (int j = 1; j <= i; j++) {
                factorials[i] *= j;
            }
        }

        // Loop over the range to find factorion numbers
        for (int i = n1; i <= n2; i++) {
            int sum = 0, nn = i;
            while (nn > 0) {
                int digit = nn % 10;
                sum += factorials[digit]; // Use precomputed factorial for the digit
                nn /= 10;
            }
            if (sum == i) {
                System.out.println(i); // Print the factorion number
            }
        }

        sc.close(); // Close the scanner object
    }
}
