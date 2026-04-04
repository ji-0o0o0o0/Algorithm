import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String ans="";
        if(a==5){
            ans="A";
        }else if(a%2==0){
            ans="B";
        }
      
        System.out.println(ans);
    }
}