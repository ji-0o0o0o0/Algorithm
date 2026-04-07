import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

	    int m  = sc.nextInt();

        System.out.println(m==12||m<=2?"Winter":(m<=5?"Sprint":(m<=8?"Summer":"Fall")));

    }
}