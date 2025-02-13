import java.util.* ;
import java.math.* ;

public class BigIntegerFactorial {

    public static void main(String[] args) {
        BigInteger n = BigInteger.ONE;
        
        int nn, i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        nn = sc.nextInt();
        
        for (i = 1; i <= nn; i++) {
            n = n.multiply(BigInteger.valueOf(i));
        }
        
        System.out.println("Factorial: " + n);
        sc.close();
    }
}
