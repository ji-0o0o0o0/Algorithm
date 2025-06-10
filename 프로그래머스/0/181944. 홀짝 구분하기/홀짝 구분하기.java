import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        // 짝수, 홀수 확인
        boolean confirm = (n%2==0);
        String result = confirm?" is even":" is odd";
        // 조건에 맞게 출력
        System.out.println(n + result);
    }
}