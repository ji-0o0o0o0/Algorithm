import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int a = sc.nextInt();

        int cnt=1;
        while(cnt<=N){
            System.out.println(cnt%a==0?"1":"0"+" ");
            cnt++;
        }

    }
}