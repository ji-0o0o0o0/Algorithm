import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

	    int a  = sc.nextInt();
        int i = 1;
        while(i<=a){
            if(i%3==0){
                System.out.print(i+" ");
                i+=3;
                continue;
            }
            i+=1;
        }
    }
}