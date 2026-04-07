import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

	    int a  = sc.nextInt();
	    int b = sc.nextInt();

        String result;

        if(a==0){
            result = (b>=19?"MAN":"BOY");
        }else{
            result = (b>=19?"WOMAN":"GIRL");
        }

        System.out.println(result);
    }
}
