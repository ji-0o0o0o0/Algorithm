class Solution {
    public int solution(int n) {
            //분석
            //순서쌍이란 두 개의 숫자를 순서를 정하여 짝지어 나타낸 쌍으로 (a, b)로 표기
            // 자연수 n이 매개변수로 주어질 때 두 숫자의 곱이 n인 자연수 순서쌍의 개수를 return
            //규칙
            //나눠지는 값을 가진 값의 갯수를 구하면 될듯
            //코딩화
            //1. for문으로 하나씩 확인해서 나눠지는 값 확인
            int cnt = 0;
            for (int i = 1; i <=n ; i++) {
                cnt+= (n%i==0?1:0);
            }
            return cnt;
        }
}