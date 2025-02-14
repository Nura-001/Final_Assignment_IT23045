import java.util.*;

public class ExtremeFinder {

    static int findExtremum(String type, int... values) {
        int minVal = Integer.MAX_VALUE;
        int maxVal = Integer.MIN_VALUE;

        for (int value : values) {
            minVal = Math.min(value, minVal);
            maxVal = Math.max(value, maxVal);
        }

        return type.equals("smallest") ? minVal : maxVal;
    }

    public static void main(String[] args) {
        System.out.println("Smallest: " + findExtremum("smallest", 5, 55, 555));
        System.out.println("Largest: " + findExtremum("largest", 5, 55));
    }
}
