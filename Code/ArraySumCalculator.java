public class ArraySumCalculator {

    // Method to calculate the sum of all elements in an integer array
    public static int calculateSum(int[] array) {
        int sum = 0;
        // Loop through the array and add each element to sum
        for (int num : array) {
            sum += num;
        }
        return sum;
    }

    public static void main(String[] args) {
        // Example array of integers
        int[] numbers = {1, 2, 3, 4, 5};

        // Call the method to calculate the sum and store the result
        int sum = calculateSum(numbers);

        // Output the result
        System.out.println("The sum of the array elements is: " + sum);
    }
}
