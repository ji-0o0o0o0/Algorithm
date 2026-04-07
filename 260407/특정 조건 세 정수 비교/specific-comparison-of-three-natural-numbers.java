import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

	    int a  = sc.nextInt();
	    int b = sc.nextInt();
        int c = sc.nextInt();

        int min = Math.min(Math.min(a,b),c);
        
        System.out.print(a==min?1:0);
        System.out.print(" ");
        System.out.print(a==b&&b==c&&c==a?1:0);

    }
}