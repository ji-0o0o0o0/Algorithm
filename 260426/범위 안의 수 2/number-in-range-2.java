import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int sumVal=0;
        int cnt=0;
        for(int i=0;i<10;i++){            
            int a= sc.nextInt();
            if(a>=0&&a<=200){
                sumVal+=a;
                cnt++;
            }
        }
        System.out.printf("%d %.1f",sumVal,(double)sumVal/cnt);
    }
}