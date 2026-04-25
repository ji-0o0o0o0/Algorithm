import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sumVal=0;
        int tmp;

        if(b<a){
            tmp =a;
            a=b;
            b=tmp;
        }

        for(int i=a;i<=b;i++){
            sumVal+=i%5==0?i:0;
        }
        System.out.println(sumVal);
    }
}