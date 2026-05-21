import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

	    int m  = sc.nextInt();
        int d;

        switch(m){
            case 1:case 3:case 5:case 7:case 8:case 10:case 12:
                d = 31;
                break;
            case 2:
                d=28;
                break;
            default: d=30; break;
        }
        
        System.out.println(d);
    }
}