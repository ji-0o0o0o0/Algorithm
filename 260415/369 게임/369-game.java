import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 1; i<=n;i++){
            String s = i+"";
            System.out.print((i%3==0||s.contains("3")||s.contains("6")||s.contains("9")?0:i) +" ");
        }
    }
}