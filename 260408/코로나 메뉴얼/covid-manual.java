import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int emergencyCnt = 0;

        for(int i = 0; i<=3;i++){
            if(sc.next().equals("Y")&&sc.nextInt()>=37){
                emergencyCnt++;
            }

            if(emergencyCnt>=2){
                System.out.println("E");
                return;
            }
        }
        System.out.println("N");

	   
    }
}