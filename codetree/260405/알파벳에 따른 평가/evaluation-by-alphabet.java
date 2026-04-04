import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String name;

        switch(a){
            case "S": name = "Superior"; break;
            case "A": name = "Excellent"; break;
            case "B": name = "Good"; break;
            case "C": name = "Usually"; break;
            case "D": name = "Effort"; break;
            default: name = "Failure"; break;
        }       
        System.out.println(name);
    }
}