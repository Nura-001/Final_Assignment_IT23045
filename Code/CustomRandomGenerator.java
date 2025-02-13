import java.util.*;

public class CustomRandomGenerator {

    private final int[] predefinedArray;
    private final int maxValue;
    private final Random random;

    public CustomRandomGenerator(int[] predefinedArray, int maxValue) {
        if (predefinedArray == null || predefinedArray.length == 0) {
            throw new IllegalArgumentException("Predefined array cannot be null or empty.");
        }
        this.predefinedArray = predefinedArray;
        this.maxValue = maxValue;
        this.random = new Random();
    }

    public int nextInt() {
        long currentTime = System.currentTimeMillis();
        int index = (int) (currentTime % predefinedArray.length);
        int randomNumber = (int) ((currentTime * predefinedArray[index]) % maxValue);

        return Math.abs(randomNumber); // Ensure positive results
    }

    public int nextInt(int bound) {
        if (bound <= 0) {
            throw new IllegalArgumentException("Bound must be positive.");
        }
        return Math.abs(nextInt() % bound);
    }

    public static void main(String[] args) {
        int[] myArray = {7, 13, 2, 19, 5};
        CustomRandomGenerator generator = new CustomRandomGenerator(myArray, 100);

        System.out.println("Random Numbers:");
        for (int i = 0; i < 10; i++) {
            System.out.println(generator.nextInt());
        }

        System.out.println("\nNumbers within a specific bound (30):");
        for (int i = 0; i < 10; i++) {
            System.out.println(generator.nextInt(30));
        }
    }
}
