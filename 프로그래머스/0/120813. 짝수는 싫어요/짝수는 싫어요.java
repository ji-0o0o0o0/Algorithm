import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int n) {
        //분석
            // 정수 n,  n 이하의 홀수가 오름차순으로 담긴 배열을 return
            //규칙
            // 반복문으로 홀수인거 list에 넣어주기!

            //코딩화
            //1. list 만들기
            List<Integer> list = new ArrayList<>();
            //2. for 문을 이용하여 하나씩 홀수일때 list에 넣어준다.
            for (int i = 1; i <=n; i++) {
                if (i % 2 != 0) {
                    list.add(i);
                }
            }
            
            // List<Integer> → int[] 로 변환
               return list.stream().mapToInt(x -> x).toArray();
    }
}