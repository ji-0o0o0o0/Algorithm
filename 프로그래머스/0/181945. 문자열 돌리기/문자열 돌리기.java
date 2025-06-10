import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Str 받기
        String str = sc.next();
        //한단어씩 끊어서 출력
        for(char a : str.toCharArray()){
            System.out.println(a);
        }
    }
}