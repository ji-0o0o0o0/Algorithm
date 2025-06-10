import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        
         for (int i =0 ; i<a.length();i++){
            char value = a.charAt(i);
            if(Character.isLowerCase(value)){//소문자일때
                System.out.print(Character.toUpperCase(value));
            }else{//대문자일때
                System.out.print(Character.toLowerCase(value));
            }
        }
    }
}