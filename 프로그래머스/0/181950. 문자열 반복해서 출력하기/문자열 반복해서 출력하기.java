import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();
        
         //str이 n번 박복된 문자열 만들어 출력
        for(int i =0 ; i<n;i++){
            System.out.print(str);
        }
    }
}