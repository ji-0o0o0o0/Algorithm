class Solution {
    public int solution(int a, int b, boolean flag) {
            // 분석
            //두 정수 a, b
            //boolean 변수 flag
            // 규칙
            //flag가 true면 a + b를 , false면 a - b를 return
            //코딩화
            //1. flag가 true면 a + b를 , false면 a - b를 return
            return flag ? a + b : a - b;
        }
}