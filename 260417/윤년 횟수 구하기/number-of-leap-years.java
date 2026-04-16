import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int cnt =0;
        for(int i=1;i<=n;i++){
            cnt+=!(i%4!=0 || (i%100==0&&i%400!=0))?1:0;
        }
        System.out.println(cnt);
    }
}