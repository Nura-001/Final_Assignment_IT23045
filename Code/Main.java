//36


// First interface (Alpha) with two methods
interface Alpha {
    void methodA();
    void methodB();
}

// Second interface (Beta) with two methods
interface Beta {
    void methodC();
    void methodD();
}

// Abstract class implementing only one interface (Alpha)
// Defines at most one abstract method
abstract class AbstractBase implements Alpha {
    
    // Implements methodA from Alpha
    @Override
    public void methodA() {
        System.out.println("Method A implemented in AbstractBase");
    }
    
    // Defines at most one abstract method
    public abstract void methodE();
}

// FinalClass extends AbstractBase and indirectly implements all five methods
class FinalClass extends AbstractBase implements Beta {

    // Implements methodB from Alpha
    @Override
    public void methodB() {
        System.out.println("Method B implemented in FinalClass");
    }

    // Implements methodC from Beta
    @Override
    public void methodC() {
        System.out.println("Method C implemented in FinalClass");
    }

    // Implements methodD from Beta
    @Override
    public void methodD() {
        System.out.println("Method D implemented in FinalClass");
    }

    // Implements methodE from AbstractBase
    @Override
    public void methodE() {
        System.out.println("Method E implemented in FinalClass");
    }
}

// Main class to test the implementation
public class Main {
    public static void main(String[] args) {
        FinalClass obj = new FinalClass();
        
        obj.methodA(); // Inherited from AbstractBase
        obj.methodB(); // Implemented in FinalClass
        obj.methodC(); // Implemented in FinalClass
        obj.methodD(); // Implemented in FinalClass
        obj.methodE(); // Implemented in FinalClass
    }
}
