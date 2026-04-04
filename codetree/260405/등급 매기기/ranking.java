import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String score;

        switch(a/10){
            case 10: score = "A"; break;
            case 9: score = "A"; break;
            case 8: score = "B"; break;
            case 7: score = "C"; break;
            case 6: score = "D"; break;
            default: score = "F"; break;
        }       
        System.out.println(score);
    }
}