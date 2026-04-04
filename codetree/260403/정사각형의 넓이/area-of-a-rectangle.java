import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.printf("%d"+(n<5?"%ntiny":""),n*n);
    }
}