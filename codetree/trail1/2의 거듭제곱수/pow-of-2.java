import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int i =1;
        int result = 2;
        while(true){
            
            if(result==n){
                System.out.println(i);
                break;
            }
            i++;
            result *=2;
        }
    }
}