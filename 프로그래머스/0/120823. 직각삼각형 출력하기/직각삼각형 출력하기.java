import java.util.Scanner;

public class Solution {
     public static void main(String[] args) {
        //분석
        //직사각형 출력하기

        //규칙
        //정수 n 이 주어지면 높이와 너비가 n 인 직각 이등변 삼각형을 출력

        //코딩화
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i =1;i<=n;i++){
            for (int j = 0; j <i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}