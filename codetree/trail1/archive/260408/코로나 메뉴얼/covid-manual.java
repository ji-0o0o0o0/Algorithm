import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int emergencyCnt = 0;

        for(int i = 0; i<3;i++){
            String s = sc.next();
            int temp = sc.nextInt();

            if(s.equals("Y") && temp >= 37){
                emergencyCnt++;
            }
        }
        System.out.println(emergencyCnt>=2?"E":"N");

	   
    }
}