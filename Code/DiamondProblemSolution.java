interface X {
    default void show() {
        System.out.println("X's show");
    }
}

interface Y {
    default void show() {
        System.out.println("Y's show");
    }
}

public class Z implements X, Y {
    // Resolving Diamond Problem by overriding and using super
    public void show() {
        X.super.show();  // Calls X's show
        Y.super.show();  // Calls Y's show
        System.out.println("Z's show");
    }

    public static void main(String[] args) {
        Z obj = new Z();
        obj.show();
        // Output:
        // X's show
        // Y's show
        // Z's show
    }
}
