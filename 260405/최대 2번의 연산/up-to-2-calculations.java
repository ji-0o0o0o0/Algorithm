import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int result =  a;
        if(a%2==0){
            result /=2;
        }
        if(a%2==1){
            result= (result+1)/2;
        }
      
        System.out.println(result);
    }
}