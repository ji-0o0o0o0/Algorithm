class Solution {
    public int solution(int age) {
            //분석
            //2022년 기준 선생님의 나이 age가 주어질 때, 선생님의 출생 연도를 return

            //규칙
            // 현재일자(2022)에서 age를 뺴서 출생연도 구하면 됨

            //코딩화
            // 1. 2022에서 age 빼 출생년도 return
            return 2022 - age+1;
        }
}