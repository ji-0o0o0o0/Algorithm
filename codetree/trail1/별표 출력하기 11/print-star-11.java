import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int size = 2 * n + 1;

        for(int i = 0; i < size; i++) {
            for(int j = 0; j < size; j++) {
                if(i % 2 == 0 || j % 2 == 0)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}