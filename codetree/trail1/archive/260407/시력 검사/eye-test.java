
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

	    float a  = sc.nextFloat();
	    float b = sc.nextFloat();

        String result;

        result = (a>=1.0&&b>=1.0?"High":(a>=0.5&&b>=0.5?"Middle":"Low"));
        System.out.println(result);
    }
}