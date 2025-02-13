import java.util.* ;

class BaseClass {
    public void printResult(String message, double result) {
        System.out.println(message + ": " + result);
    }
    public void printResult(String message, String result) {
        System.out.println(message + ": " + result);
    }
}

class SumClass extends BaseClass {
    public void calculateSum() {
        double sum = 0;
        for (double i = 1.0; i >= 0.1; i -= 0.1) {
            sum += i;
        }
        printResult("Sum of series", sum);
    }
}

class DivisorMultipleClass extends BaseClass {
    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    private int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    public void findGCDAndLCM(int a, int b) {
        int gcd = gcd(a, b);
        int lcm = lcm(a, b);
        printResult("GCD", gcd);
        printResult("LCM", lcm);
    }
}

class NumberConversionClass extends BaseClass {
    public void convert(int num) {
        String binary = Integer.toBinaryString(num);
        String octal = Integer.toOctalString(num);
        String hexadecimal = Integer.toHexString(num);
        printResult("Binary", binary);
        printResult("Octal", octal);
        printResult("Hexadecimal", hexadecimal);
    }
}

class CustomPrintClass extends BaseClass {
    public void
