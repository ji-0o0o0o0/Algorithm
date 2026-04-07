import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

	    int a  = sc.nextInt();
	    int b = sc.nextInt();

        if(a<90) {
            System.out.println(0);
            break;
        }
        

        System.out.println(b>=95?100000:(b>=90?50000:0));
    }
}