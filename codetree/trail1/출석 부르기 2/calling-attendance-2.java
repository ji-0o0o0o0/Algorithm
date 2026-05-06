import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true){
            int n = sc.nextInt();
            if(n>4){
                System.out.println("Vacancy");
                break;
            }else{
                System.out.println(n==1?"John":n==2?"Tom":n==3?"Paul":"Sam");
            }
        }
    }

}