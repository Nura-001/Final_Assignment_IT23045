public class SingletonExample {
    
    // Static instance of the singleton class
    private static SingletonExample instance = new SingletonExample();

    // Private constructor to prevent instantiation from other classes
    private SingletonExample() {}

    // Static method to access the single instance
    public static SingletonExample getter() {
        return instance;
    }

    // Display method to show some output
    public void display() {
        System.out.println(5);
    }

    // Main method to test the Singleton pattern
    public static void main(String[] args) {
        
        // Retrieve the singleton instance using the getter method
        SingletonExample ob = SingletonExample.getter();
        
        // Call the display method on the instance
        ob.display();
    }
}
