import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        System.out.println(a>=1.0?"High":(a>=0.5?"Middle":"Low"));
    }
}