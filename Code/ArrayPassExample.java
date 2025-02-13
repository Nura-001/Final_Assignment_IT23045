public class ArrayPassExample {

    // Method to calculate the sum of elements in an array
    public static int calculateSum(int[] numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] values = {10, 20, 30, 40, 50};
        
        // Passing the array to the method
        int result = calculateSum(values);
        
        // Printing the sum of array elements
        System.out.println("The sum of array elements is: " + result);
    }
}
