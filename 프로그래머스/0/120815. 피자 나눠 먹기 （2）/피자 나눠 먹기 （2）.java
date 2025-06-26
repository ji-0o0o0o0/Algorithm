class Solution {
    public int solution(int n) {
       //분석
            // 머쓱이네 피자가게는 피자를 여섯 조각
            // 피자를 나눠먹을 사람의 수 n
            // n명이 주문한 피자를 남기지 않고 모두 같은 수의 피자 조각을 먹어야 한다면 최소 몇 판을 시켜야 하는지를 return
            // -> 6조각씩 n명이 같은 수를 먹어야함

            //규칙
            //  (6*answer) % n = 0

            //코딩화
            // 1. while 문으로 (6*answer) % n = 0 이 될때까지 확인
            int answer = 1;
            while ((6 * answer) % n != 0) {
                answer++;
            }
            return answer;
    }
}