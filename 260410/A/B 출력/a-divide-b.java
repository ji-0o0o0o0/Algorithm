import java.util.*;
import java.math.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	    
        BigDecimal A = sc.nextBigDecimal();
        BigDecimal B = sc.nextBigDecimal();

        BigDecimal result = A.divide(B, 20, RoundingMode.DOWN);

        System.out.println(result);
    
    }
}