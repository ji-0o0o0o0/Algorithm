import java.util.*;
class Solution {
     public int solution(int[] numbers) {
            //분석
            //정수 배열 numbers가 매개변수로 주어집니다. numbers의 원소 중 두 개를 곱해 만들 수 있는 최댓값을 return
            //규칙
            //내림차순으로 정렬해서 첫번째 두번째 숫자 곱하면 됨
            //코딩화
            //배열 정렬
            Arrays.sort(numbers);
            return numbers[numbers.length-1]*numbers[numbers.length-2];
        }
}