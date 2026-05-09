import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum =0;
        int i=0 ;
        while(true){
            int n = sc.nextInt();
            
            if(n<20||n>29){
                System.out.printf("%.2f",(float)sum/i);
                break;
            }

            sum+=n;
            i++;
        }
    }

}