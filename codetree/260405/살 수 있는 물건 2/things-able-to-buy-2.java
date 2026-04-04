import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String name = "no";

        if(a>=3000){
            name="book";
        }else if(a>=1000){
            name="mask";
        }else if(a>=500){
            name="pen";                   
        }
        System.out.println(name);
    }
}