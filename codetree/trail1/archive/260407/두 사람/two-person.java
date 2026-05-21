import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

	    int a  = sc.nextInt();
        String aSex = sc.next();
	    int b = sc.nextInt();
        String bSex = sc.next();

        System.out.println(a>=19&&aSex.equals("M")||b>=19&&bSex.equals("M")?1:0);
    }
}