import java.util.*;

class Solution {
    public double solution(int[] numbers) {
            //분석
            //정수 배열 numbers가 매개변수로 주어집니다. numbers의 원소의 평균값을 return
            //규칙
            //numbers 안에 있는 숫자 모두 더해서 numbers의 갯수를 나누면 된다.
            //코딩화
            //1. 모두 더한다
            double sum = Arrays.stream(numbers).sum();
            //2. 더한 값을 총 개수로 나눈다.
            return sum/numbers.length;
        }
}