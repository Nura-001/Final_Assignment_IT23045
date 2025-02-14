import java.util.*;

public class InstanceCounter {

    public static void main(String[] args) {
        for (int i = 0; i < 60; i++) {
            new Instance(1); 
        }
    }
}

class Instance {

    private static int instanceCount = 0;

    public Instance(int increment) {
        instanceCount += increment;
        System.out.println("Current Instance Count: " + instanceCount);

        if (instanceCount > 50) {
            System.out.println("Instance count exceeded 50. Resetting...");
            instanceCount = 0;
        }
    }
}
