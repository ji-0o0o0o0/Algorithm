import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result=0;
        int i;
        for(i=1;i<=100;i++){
            result+=i;
            if(result>=n)break;
            
        }
        System.out.println(i);

    }
}